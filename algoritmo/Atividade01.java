package algoritmo;

public class Atividade01 {

//    1) Crie um procedimento que, dado um número N por parâmetro, desenhe o seguinte padrão na tela:
    public static void printDesign(int num){
        int counter = 0;
        for (int i = 0; i < num; i++) {
            counter++;
            for (int j = 1; j <= num ; j++) {
                if(counter == j ){
                    System.out.print(counter + " ");
                } else{
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {

        printDesign(5);
    }
}
