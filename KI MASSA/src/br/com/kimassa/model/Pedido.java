package br.com.kimassa.model;

import br.com.kimassa.util.Auditavel;
import br.com.kimassa.util.Calculavel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Auditavel, Calculavel {

    private int id;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private String status;

    private List<String> historico;

    public Pedido(int id,
                  Cliente cliente,
                  Produto produto,
                  int quantidade) {

        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;

        this.status = "Em preparo";

        historico = new ArrayList<>();

        registrarLog("Pedido criado");
    }

    @Override
    public void registrarLog(String acao) {

        String log =
                LocalDateTime.now() + " - " + acao;

        historico.add(log);
    }

    @Override
    public String obterHistorico() {

        StringBuilder sb =
                new StringBuilder();

        for (String log : historico) {

            sb.append(log).append("\n");
        }

        return sb.toString();
    }

    @Override
    public double calcularTaxaEntrega() {

        return 8.0;
    }

    @Override
    public double calcularDesconto() {

        double subtotal =
                produto.getPreco() * quantidade;

        if (subtotal >= 100) {

            return subtotal * 0.10;
        }

        return 0;
    }

    @Override
    public double calcularValorFinal() {

        double subtotal =
                produto.getPreco() * quantidade;

        return subtotal
                + calcularTaxaEntrega()
                - calcularDesconto();
    }

    public void atualizarStatus(String novoStatus) {

        this.status = novoStatus;

        registrarLog("Status atualizado para: "
                + novoStatus);
    }

    public void exibirPedido() {

        System.out.println("Pedido: " + id);

        System.out.println("Cliente: "
                + cliente.getNome());

        System.out.println("Produto: "
                + produto.getNome());

        System.out.println("Quantidade: "
                + quantidade);

        System.out.println("Status: "
                + status);

        System.out.println("Valor final: R$ "
                + calcularValorFinal());
    }

    public int getId() {
        return id;
    }
}