package atividade05;

public class Programador extends Funcionario{

    public Programador(int qtdHoraSemanal, double valorHora) {
        super(qtdHoraSemanal, valorHora);
    }

    @Override
    public double calcularSalario() {
        return getQtdHoraSemanal() * getValorHora() * 3.8;
    }

    @Override
    public double calcularComissao() {
        return (calcularSalario() * 20) / 100;
    }
}
