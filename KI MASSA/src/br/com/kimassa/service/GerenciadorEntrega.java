package br.com.kimassa.service;

import br.com.kimassa.model.Entregador;
import br.com.kimassa.model.Pedido;

public class GerenciadorEntrega {

    public void atribuirEntregador(Pedido pedido,
                                   Entregador entregador) {

        System.out.println(
                "\n=== GERENCIADOR DE ENTREGA ===");

        if (entregador.isDisponivel()) {

            entregador.setDisponivel(false);

            pedido.setEntregador(entregador);

            pedido.atualizarStatus(
                    "Saiu para entrega");

            System.out.println(
                    "Entregador atribuido: "
                            + entregador.getNome());

            System.out.println(
                    "Veiculo: "
                            + entregador.getVeiculo());

            System.out.println(
                    "Pedido saiu para entrega!");

        } else {

            System.out.println(
                    "Entregador indisponivel!");
        }
    }
}
