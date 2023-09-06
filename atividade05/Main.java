package atividade05;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(40, 23);
        Programador programador = new Programador(40, 32);
        Analista analista = new Analista(40, 20);
        Suporte suporte = new Suporte(40, 18.5);


        System.out.println("Gerente");
        System.out.println(gerente.calcularComissao());
        System.out.println(gerente.calcularSalario());
        System.out.println("---------------------------------------------------------------");
        System.out.println("Programador");
        System.out.println(programador.calcularComissao());
        System.out.println(programador.calcularSalario());
        System.out.println("---------------------------------------------------------------");
        System.out.println("Analista");
        System.out.println(analista.calcularComissao());
        System.out.println(analista.calcularSalario());
        System.out.println("---------------------------------------------------------------");
        System.out.println("Suporte");
        System.out.println(suporte.calcularComissao());
        System.out.println(suporte.calcularSalario());

    }
}
