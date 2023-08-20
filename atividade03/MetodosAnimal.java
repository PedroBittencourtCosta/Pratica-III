package atividade03;

public class MetodosAnimal {

    public void emitirSom(){
        System.out.println("O animal esta emitindo um som!!");
    }

    public void emitirSom(String som){
        System.out.println("O animal esta emitindo o som: " + som);
    }

    public void emitirSom(int qtd){
        System.out.printf("O animal falou %d vezes\n", qtd);
    }

    public void alimentar(){
        System.out.println("O animal esta se alimentando!!");
    }

    public void alimentar(String comida){
        System.out.println("O animal esta comendo: " + comida);
    }

    public void alimentar(int qtd){
        System.out.printf("O animal comeu %d vezes\n", qtd);
    }

    public void movimentacao(){
        System.out.println("O animal esta se movimentando!!");
    }

}
