package atividade01;

public class AtividadeProcedimentos {

//        Escreva um procedimento que imprima todos os números de 1 a 10.
    static void imprimir(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    //     Escreva um procedimento que imprima todos os números pares de 0 a 100.
    static void imprimirNumeros(){
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0) System.out.println(i);
        }

    }

    //      Escreva um procedimento que mostre na tela toda a tabuada do 5. Exemplo:
    static void tabuadaDo5(){
        for (int i = 0; i < 10; i++) {
            System.out.printf("\n5 x %d  = %d",i + 1,5 * (i + 1));
        }

    }

    // Criar um procedimento que deve receber um valor inteiro positivo como parâmetro e exibir se o valor informado pelo usuário é par ou ímpar.
    static void exibirValor(int num){

        if(num % 2 == 0){
            System.out.println("O numero é par");
        }else {
            System.out.println("O numero é impar");
        }

    }

    // Escreva um procedimento que imprima a tabuada de um número inteiro dado como entrada.

    static void imprimirTabuada(int num){
        for (int i = 0; i < 10; i++) {
            System.out.printf("\n%d x %d  = %d", num,i + 1,num * (i + 1));
        }

    }

    public static void main(String[] args) {

        imprimir();

        System.out.println("\n------------------------------------------------------------");

        imprimirNumeros();

        System.out.println("\n------------------------------------------------------------");

        tabuadaDo5();

        System.out.println("\n------------------------------------------------------------");

        exibirValor(5);

        System.out.println("\n------------------------------------------------------------");

        imprimirTabuada(7);

        System.out.println("\n------------------------------------------------------------");
    }
}
