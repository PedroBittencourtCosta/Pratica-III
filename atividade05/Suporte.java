package atividade05;

public class Suporte extends Funcionario{

    public Suporte(int qtdHoraSemanal, double valorHora) {
        super(qtdHoraSemanal, valorHora);
    }

    @Override
    public double calcularSalario() {
        return getQtdHoraSemanal() * getValorHora() * 2;
    }

    @Override
    public double calcularComissao() {
        return 0;
    }
}
