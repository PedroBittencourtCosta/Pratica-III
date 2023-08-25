package algoritmo;

import java.util.Scanner;

public class jajaja {

    public static boolean checkWin(String[][] matriz, String player) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0].equals(player) && matriz[i][1].equals(player) && matriz[i][2].equals(player)) {
                return true; // row win
            }
            if (matriz[0][i].equals(player) && matriz[1][i].equals(player) && matriz[2][i].equals(player)) {
                return true; // column win
            }
        }
        if (matriz[0][0].equals(player) && matriz[1][1].equals(player) && matriz[2][2].equals(player)) {
            return true; // diagonal win
        }
        if (matriz[0][2].equals(player) && matriz[1][1].equals(player) && matriz[2][0].equals(player)) {
            return true; // diagonal win
        }
        return false; // no win
    }

    //imprimir matriz
    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%s\t", matriz[i][j]);
            }
            System.out.println();
        }

    }
    //Função (pois retorna um valor) = Verificar se a posição é valida dentro de (0-2) pra linha!!
    public static int verificarLinha(int linha) {
        Scanner scan = new Scanner(System.in);

        while (linha < 0 || linha > 2) {
            System.out.println("Digite a linha que deseja: ");
            linha = scan.nextInt();
        }
        return linha;
    }
    //Função (pois retorna um valor) = Verificar se a posição é valida dentro de (0-2) pra coluna!!
    public static int verificarColuna(int coluna) {
        Scanner scan = new Scanner(System.in);

        while (coluna < 0 || coluna > 2) {
            System.out.println("Digite a coluna que deseja: ");
            coluna = scan.nextInt();
        }
        return coluna;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] m = new String[3][3];
        int linha = 0, coluna = 0;
        String j1, j2, jogador = null, marcar = null;
        boolean game = true;
        int cont = 1;

        String uaua = "uue";

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = "_";
            }
        }

        System.out.println("Digite o nome do jogador 1: ");
        j1 = scan.nextLine();
        System.out.println("Digite o nome do jogador 2: ");
        j2 = scan.nextLine();

        while (game) {
            boolean rodar = true;
            if (!(cont % 2 == 0)) {
                jogador = j1;
                marcar = "X";
            } else {
                jogador = j2;
                marcar = "O";
            }
            imprimirMatriz(m);

            System.out.println("Vez do jogador " + jogador);
            System.out.println("Digite a linha que deseja: ");
            linha = scan.nextInt();
            linha = verificarLinha(linha);
            System.out.println("Digite a coluna que deseja: ");
            coluna = scan.nextInt();
            coluna = verificarColuna(coluna);

            if (m[linha][coluna] != "_") {
                while (rodar) {
                    System.out.println("Posição invalida");
                    System.out.println("Digite a linha que deseja: ");
                    linha = scan.nextInt();
                    linha = verificarLinha(linha);

                    System.out.println("Digite a coluna que deseja: ");
                    coluna = scan.nextInt();
                    coluna = verificarColuna(coluna);

                    if (m[linha][coluna] == "_") {
                        rodar = false;
                    }
                }
            }
            m[linha][coluna] = marcar;
            cont++;

            int contador = 0;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if(m[i][j] == "X"){
                        cont++;
                    }
                }

                if(cont == 3){
                    game = false;
                    break;
                }
                cont = 0;
            }

        }

    }

}