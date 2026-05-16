package br.com.kimassa.model;

import java.io.Serializable;

public class Entregador implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nome;
    private String veiculo;
    private boolean disponivel;

    public Entregador(int id,
                      String nome,
                      String veiculo,
                      boolean disponivel) {

        this.id = id;
        this.nome = nome;
        this.veiculo = veiculo;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void exibirEntregador() {

        System.out.println("\n=== ENTREGADOR ===");

        System.out.println("ID: " + id);

        System.out.println("Nome: "
                + nome);

        System.out.println("Veiculo: "
                + veiculo);

        System.out.println("Disponivel: "
                + disponivel);
    }
}
