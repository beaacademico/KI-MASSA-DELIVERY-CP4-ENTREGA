package br.com.kimassa.service;

import br.com.kimassa.model.Pedido;

public class CalculadoraPedido {

    public void mostrarResumo(Pedido pedido) {

        System.out.println(
                "\n=== RESUMO FINANCEIRO ===");

        pedido.exibirPedido();
    }
}
