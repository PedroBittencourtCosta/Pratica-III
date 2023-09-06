package atividade05;

public abstract class Funcionario {

    private String nome;
    private int idade;
    private int qtdHoraSemanal;
    private double valorHora;

    public Funcionario(int qtdHoraSemanal, double valorHora) {
        this.qtdHoraSemanal = qtdHoraSemanal;
        this.valorHora = valorHora;
    }

    public abstract double calcularSalario();

    public abstract double calcularComissao();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getQtdHoraSemanal() {
        return qtdHoraSemanal;
    }

    public double getValorHora() {
        return valorHora;
    }
}
