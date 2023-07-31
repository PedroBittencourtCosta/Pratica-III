package atividade01;

// Crie uma classe que tenha um procedimento que imprima todos os números ímpares entre dois números inteiros dados como
// entrada e outro procedimento com valores pares. Após isso, crie uma outra classe que faça a chamada de ambos os procedimentos.
public class Procedimento {

    public static void imprimirImpares(int num01, int num02){
        for (int i = num01; i <= num02; i++) {
            int aux = num01++;
            if (!(aux % 2 == 0)){
                System.out.print(aux + " ");
            }

        }
    }

    public static void imprimirPares(int num01, int num02){
        for (int i = num01; i <= num02; i++) {
            int aux = num01++;
            if (aux % 2 == 0){
                System.out.print(aux + " ");
            }

        }
    }
}
