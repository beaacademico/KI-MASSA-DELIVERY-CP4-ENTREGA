package br.com.kimassa;

import br.com.kimassa.model.Cliente;
import br.com.kimassa.model.Entregador;
import br.com.kimassa.model.Pedido;
import br.com.kimassa.model.Produto;

import br.com.kimassa.service.CalculadoraPedido;
import br.com.kimassa.service.GerenciadorEntrega;

public class Main {

    public static void main(String[] args) {

        Cliente cliente =
                new Cliente(
                        1,
                        "Beatriz",
                        "Rua Central",
                        "11999999999");

        Produto produto =
                new Produto(
                        1,
                        "Pizza Calabresa",
                        55.0,
                        20);

        Pedido pedido =
                new Pedido(
                        1,
                        cliente,
                        produto,
                        2);

        produto.diminuirEstoque(2);

        CalculadoraPedido calc =
                new CalculadoraPedido();

        calc.mostrarResumo(pedido);

        Entregador entregador =
                new Entregador(
                        1,
                        "Carlos",
                        "Moto",
                        true);

        GerenciadorEntrega gerenciador =
                new GerenciadorEntrega();

        gerenciador.atribuirEntregador(
                pedido,
                entregador);

        pedido.exibirPedido();

        System.out.println("\n=== HISTÓRICO ===");

        System.out.println(
                pedido.obterHistorico());
    }
}