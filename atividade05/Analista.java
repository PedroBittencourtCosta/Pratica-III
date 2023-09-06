package atividade05;

public class Analista extends Funcionario{

    public Analista(int qtdHoraSemanal, double valorHora) {
        super(qtdHoraSemanal, valorHora);
    }

    @Override
    public double calcularSalario() {
        return getQtdHoraSemanal() * getValorHora() * 3;
    }

    @Override
    public double calcularComissao() {
        return (calcularSalario() * 10) / 100;
    }
}
