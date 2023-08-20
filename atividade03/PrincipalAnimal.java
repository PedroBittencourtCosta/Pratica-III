package atividade03;

public class PrincipalAnimal {
    public static void main(String[] args) {

        // exercicio 01
        Animal animal01 = new Animal();
        Animal animal02 = new Animal();
        Animal animal03 = new Animal();

        // exercicio 02
        Cao cao = new Cao();
        Pato pato = new Pato();
        Passaro passaro = new Passaro();

        // exercicio 04
        cao.movimentacao();
        passaro.movimentacao();
        pato.movimentacao();
    }
}
