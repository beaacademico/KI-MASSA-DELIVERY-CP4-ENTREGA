package br.com.kimassa;

import java.util.Scanner;

import br.com.kimassa.model.Cliente;
import br.com.kimassa.model.Entregador;
import br.com.kimassa.model.Pedido;
import br.com.kimassa.model.Produto;

import br.com.kimassa.service.CalculadoraPedido;
import br.com.kimassa.service.GerenciadorEntrega;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CalculadoraPedido calc =
                new CalculadoraPedido();

        GerenciadorEntrega gerenciador =
                new GerenciadorEntrega();

        Pedido pedido = null;

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n===== KI MASSA =====");

            System.out.println("1 - Criar pedido");
            System.out.println("2 - Atualizar status");
            System.out.println("3 - Ver pedido");
            System.out.println("4 - Ver historico");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\n=== NOVO PEDIDO ===");

                    System.out.print("Nome do cliente: ");
                    String nome = sc.nextLine();

                    System.out.print("Endereco: ");
                    String endereco = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    Cliente cliente =
                            new Cliente(
                                    1,
                                    nome,
                                    endereco,
                                    telefone);

                    System.out.print("Nome do produto: ");
                    String nomeProduto = sc.nextLine();

                    System.out.print("Preco do produto: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade em estoque: ");
                    int estoque = sc.nextInt();

                    Produto produto =
                            new Produto(
                                    1,
                                    nomeProduto,
                                    preco,
                                    estoque);

                    System.out.print("Quantidade do pedido: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    boolean estoqueOk =
                            produto.diminuirEstoque(quantidade);

                    if (!estoqueOk) {

                        System.out.println(
                                "\nPedido cancelado por falta de estoque.");

                        break;
                    }

                    pedido =
                            new Pedido(
                                    1,
                                    cliente,
                                    produto,
                                    quantidade);

                    calc.mostrarResumo(pedido);

                    Entregador entregador =
                            new Entregador(
                                    1,
                                    "Carlos",
                                    "Moto",
                                    true);

                    gerenciador.atribuirEntregador(
                            pedido,
                            entregador);

                    System.out.println(
                            "\nPedido criado com sucesso!");

                    break;

                case 2:

                    if (pedido == null) {

                        System.out.println(
                                "\nNenhum pedido criado.");

                        break;
                    }

                    System.out.println(
                            "\n=== ATUALIZAR STATUS ===");

                    System.out.println("1 - Em preparo");
                    System.out.println("2 - Saiu para entrega");
                    System.out.println("3 - Entregue");

                    System.out.print("Escolha: ");

                    int status = sc.nextInt();
                    sc.nextLine();

                    switch (status) {

                        case 1:

                            pedido.atualizarStatus(
                                    "Em preparo");

                            break;

                        case 2:

                            pedido.atualizarStatus(
                                    "Saiu para entrega");

                            break;

                        case 3:

                            pedido.atualizarStatus(
                                    "Entregue");

                            break;

                        default:

                            System.out.println(
                                    "Status invalido.");
                    }

                    System.out.println(
                            "Status atualizado!");

                    break;

                case 3:

                    if (pedido == null) {

                        System.out.println(
                                "\nNenhum pedido criado.");

                        break;
                    }

                    System.out.println(
                            "\n=== DADOS DO PEDIDO ===");

                    pedido.exibirPedido();

                    break;

                case 4:

                    if (pedido == null) {

                        System.out.println(
                                "\nNenhum pedido criado.");

                        break;
                    }

                    System.out.println(
                            "\n=== HISTORICO ===");

                    System.out.println(
                            pedido.obterHistorico());

                    break;

                case 5:

                    System.out.println(
                            "\nSistema encerrado.");

                    break;

                default:

                    System.out.println(
                            "\nOpcao invalida.");
            }
        }

        sc.close();
    }
}
