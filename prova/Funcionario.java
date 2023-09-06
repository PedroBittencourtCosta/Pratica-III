package prova;

public class Funcionario extends Pessoa{

    private int identificar;
    private double salario;

    public Funcionario(String nome, int idade, int identificar, double salario) {
        super(nome, idade);
        this.identificar = identificar;
        this.salario = salario;
    }

    public int getIdentificar() {
        return identificar;
    }

    public void setIdentificar(int identificar) {
        this.identificar = identificar;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
