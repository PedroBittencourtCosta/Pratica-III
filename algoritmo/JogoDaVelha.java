package algoritmo;

import java.io.IOException;
import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args){
        String[][] mat = {
                {"_", "_","_"},
                {"_", "_","_"},
                {"_", "_","_"}
        };
        boolean game = true, game02 = true;
        Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < mat.length; i++){
        // for (int j = 0; j < mat[i].length; j++){
        // System.out.print(mat[i][j] + " ");
        // }
        // System.out.println(" ");
        // }

        do {

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println(" ");
            }

            System.out.println("Insira a linha");
            int linha = sc.nextInt();
            System.out.println("insira a coluna");
            int coluna = sc.nextInt();

            mat[linha][coluna] = "X";
//            if(mat[linha][coluna] != ""){
//                while (game02){
//                    System.out.println("lugar ocupado");
//                    System.out.println("Insira a linha");
//                     linha = sc.nextInt();
//                    System.out.println("insira a coluna");
//                     coluna = sc.nextInt();
//                    if(mat[linha][coluna] == ""){
//                        game02 = false;
//                    }
//
//                }
//            }



            int cont = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if(mat[i][j].equalsIgnoreCase("x")){
                        cont++;
                    }
                }

                if(cont == 3){
                    game = false;
                    break;
                }
                cont = 0;
            }


        } while (game);
    }
}
