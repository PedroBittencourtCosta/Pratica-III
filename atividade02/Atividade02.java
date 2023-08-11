package atividade02;
public class Atividade02 {


    public static void main(String[] args) {

        int[] vet = {5,3,6,7,8,9,2,4,1,0};
        int[][] mat = new int[3][3];

        preencherMat(mat);
        exibirMesPorExtenso(2);
        System.out.println(divisor(3, 3));
        imprimirVetor(vet);
        imprimirMatriz(mat);
        bubbleSort(vet);
        System.out.println(calcularMediaMatriz(mat));
        diagonalPrincipal(mat);
    }

    //    Escreva um procedimento chamado exibirMesPorExtenso que receba um número inteiro e
//        imprima o mês correspondente ao número. Por exemplo, 2 corresponde à “fevereiro”. O
//        procedimento deve mostrar uma mensagem de erro caso o número recebido não faça sentido
            static void exibirMesPorExtenso(int mes){
                switch (mes) {
                    case 1 -> System.out.println("Janeiro");
                    case 2 -> System.out.println("Fevereiro");
                    case 3 -> System.out.println("Março");
                    case 4 -> System.out.println("Abril");
                    case 5 -> System.out.println("Maio");
                    case 6 -> System.out.println("Junho");
                    case 7 -> System.out.println("Julho");
                    case 8 -> System.out.println("Agosto");
                    case 9 -> System.out.println("Setembro");
                    case 10 -> System.out.println("Outubro");
                    case 11 -> System.out.println("Novembro");
                    case 12 -> System.out.println("Dezembro");
                    default -> System.out.println("Erro!!, digite um numero valido");
                }
            }

    //    Escreva uma função chamada divisor que receba dois números inteiros x e y. Essa função
//        deve verificar se x é divisível por y. No caso positivo, a função deve retornar true, caso contrário false.
            static boolean divisor(int num01, int num02){
                if((num01 % num02) == 0){
                    return true;
                }
                return false;
            }

    //    Crie um procedimento que se chame imprimirVetor, que recebe um vetor do tipo inteiro
//        como parâmetro. O procedimento deve imprimir esse vetor na tela.
            static void imprimirVetor(int vet[]){
                for(int num : vet){
                    System.out.println(num);
                }
            }

    //    Crie um procedimento que se chame imprimirMatriz, que recebe uma matriz do tipo inteiro
//        como parâmetro. O procedimento deve imprimir essa matriz na tela.
            static void imprimirMatriz(int[][] mat){
                for (int i = 0; i < mat.length; i++){
                    for (int j = 0; j < mat[i].length; j++){
                        System.out.print(mat[i][j] + " ");
                    }
                    System.out.println();
                }
            }

    //    Criar um procedimento chamado bubbleSort, que recebe como parâmetro um vetor de
//        inteiros. Ele deve ordenar esse vetor, utilizando o método bolha e exibir o vetor ordenado.
//        Utilize o método do exercício anterior (imprimirVetor) para mostrar o vetor na tela.
            static void bubbleSort(int[] vet){
                for(int i = 0; i < vet.length; i++){
                    for(int j = 0; j< vet.length - 1; j++){
                        if(vet[j] > vet[j + 1]){
                            int aux = vet[j];
                            vet[j] = vet[j+1];
                            vet[j+1] = aux;
                        }
                    }
                }
                imprimirVetor(vet);
            }

    //    Faça uma função que recebe, por parâmetro, uma matriz A do tipo inteiro e retorna a média
//        dos seus elementos.
            static int calcularMediaMatriz(int[][] mat){
                int soma = 0;
                int qtdElementos = 0;
                for (int i = 0; i < mat.length; i++){
                    for (int j = 0; j < mat[i].length; j++){
                        soma += mat[i][j];
                        qtdElementos++;
                    }
                }

                return soma / qtdElementos;
            }

            // procedimento para preencher a matriz com numeros aleatorios
            static void preencherMat(int[][] mat){
                for (int i = 0; i < mat.length; i++){
                    for (int j = 0; j < mat[i].length; j++){
                        mat[i][j] = (int) (Math.random()*100);
                    }
                }
            }

    //    Faça um procedimento com nome diagonalPrincipal que recebe, por parâmetro, uma matriz
//        A do tipo inteiro e calcula o maior elemento da sua diagonal principal. A seguir, o
//        procedimento deve dividir todos os elementos de A pelo maior encontrado. O procedimento
//        deve mostrar a matriz original e a nova matriz alterada (utilize o procedimento
//        imprimirMatriz para exibir ambas as matrizes na tela).
            static void diagonalPrincipal(int[][] mat){
                System.out.println("Matriz original");
                imprimirMatriz(mat);

                int maior = 0;
                for (int i = 0; i < mat.length; i++){
                    for (int j = 0; j < mat[i].length; j++){
                        if(i == j){
                            if(mat[i][j] > maior) maior = mat[i][j];
                        }

                    }
                }

                for (int i = 0; i < mat.length; i++){
                    for (int j = 0; j < mat[i].length; j++){
                        mat[i][j] = mat[i][j] / maior;
                    }
                }

                imprimirMatriz(mat);
            }
}
