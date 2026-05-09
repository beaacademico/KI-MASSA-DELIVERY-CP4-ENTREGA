package br.com.kimassa.model;

public class Entregador {

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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void exibirEntregador() {

        System.out.println("Entregador: " + nome);
        System.out.println("Veículo: " + veiculo);
        System.out.println("Disponível: " + disponivel);
    }
}