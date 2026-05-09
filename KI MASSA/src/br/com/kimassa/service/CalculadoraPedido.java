package br.com.kimassa.service;

import br.com.kimassa.model.Pedido;

public class CalculadoraPedido {

    public void mostrarResumo(Pedido pedido) {

        System.out.println("=== RESUMO PEDIDO ===");

        pedido.exibirPedido();

        System.out.println("Taxa entrega: R$ "
                + pedido.calcularTaxaEntrega());

        System.out.println("Desconto: R$ "
                + pedido.calcularDesconto());

        System.out.println("Valor final: R$ "
                + pedido.calcularValorFinal());
    }
}