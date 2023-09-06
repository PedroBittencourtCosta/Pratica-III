package atividade05;

public class Gerente extends Funcionario {


    public Gerente(int qtdHoraSemanal, double valorHora) {
        super(qtdHoraSemanal, valorHora);
    }

    @Override
    public double calcularSalario() {
        return getQtdHoraSemanal() * getValorHora() * 4.2;
    }

    @Override
    public double calcularComissao() {
        return (calcularSalario() * 30) / 100;
    }
}
