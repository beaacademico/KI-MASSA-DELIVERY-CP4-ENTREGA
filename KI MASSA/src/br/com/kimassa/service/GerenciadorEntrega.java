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

            pedido.atualizarStatus(
                    "Saiu para entrega");

            System.out.println(
                    "Entregador atribuído: "
                            + entregador.getNome());

            System.out.println(
                    "Pedido saiu para entrega!");

        } else {

            System.out.println(
                    "Entregador indisponível!");
        }
    }
}
