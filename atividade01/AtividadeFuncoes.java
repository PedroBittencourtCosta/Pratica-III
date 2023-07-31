package atividade01;

public class AtividadeFuncoes {


    //Escreva uma função que retorne o quadrado de um número inteiro qualquer Exemplo:
    static int quadrado(int num){
        return num * num;
    }

    // Escreva uma função que retorne a mensagem "Hello world!”..
    static String ola(){
        return "Hello world";
    }

    // Escreva uma função que retornará true caso o valor seja múltiplo de 3 ou false, caso contrário
    static boolean multiplo(int num){
        if((num % 3) == 0){
            return true;
        }
        return false;
    }

    //Criar uma função que receberá um valor inteiro positivo. A função deverá calcular o número
    // fatorial dele ou 0 caso o valor informado for negativo ou zero.
    static int calcularFatorial(int num){

        if(num <= 0){
            return 1;
        }

        return num * calcularFatorial(num - 1);
    }

    // Escreva uma função que retorne o dobro de um número passado como parâmetro.
    static int dobrar(int num){
        return num * 2;
    }

    //Escreva uma função que verifique se um número passado como parâmetro é par ou ímpar.
    static String verificarNumero(int num){
        if(num % 2 == 0){
            return "O numero é par";
        }else {
            return "O numero é impar";
        }

    }

    // Escreva uma função que retorne o valor absoluto de um número passado como parâmetro.
    static int valorAbsoluto(int num){
        if(!(num >=0)){
            return num * -1;
        }
        return num;
    }
    public static void main(String[] args) {


        System.out.println(quadrado(4));

        System.out.println(ola());

        System.out.println(multiplo(21));

        System.out.println(calcularFatorial(5));

        System.out.println(dobrar(6));

        System.out.println(verificarNumero(7));

        System.out.println(valorAbsoluto(-9));
    }
}
