package algoritmo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioIPTU {
    public static double somarImpostoOriginal(List<Imovel> imoveis){
        double soma = 0;
        for(Imovel imovel : imoveis){
            soma += imovel.getValorDoIPTU();
        }
        return soma;
    }

    public static double somarMultas(List<Imovel> imoveis){
        double soma = 0;
        for(Imovel imovel : imoveis){
            soma+= imovel.calcularMulta();
        }
        return soma;
    }

    public static double somarJuros(List<Imovel> imoveis) {
        double soma = 0;
        for(Imovel imovel : imoveis){
            soma+= imovel.calcularJuros(imovel.getValorDoIPTU());
        }
        return soma;
    }

    public static double somarMultaCompleta(List<Imovel> imoveis) {
        double somaImposto = somarImpostoOriginal(imoveis);
        double somajuros = somarJuros(imoveis);
        double somaMulta = somarMultas(imoveis);
        return somaImposto + somaMulta + somajuros;
    }

    public static void main(String[] args) {
        int rodar = 1;
        int numeroDaCasa, valorDoIPTU, mesesAtrazado;
        Scanner sc = new Scanner(System.in);


        List<Imovel> imoveis = new ArrayList<>();

        do{

            System.out.println("Insira o numero:");
            numeroDaCasa = sc.nextInt();
            System.out.println("Insira o valor do IPTU:");
            valorDoIPTU = sc.nextInt();
            System.out.println("Insira o numero de meses em atrazo:");
            mesesAtrazado = sc.nextInt();

            Imovel imovel = new Imovel(numeroDaCasa,valorDoIPTU,mesesAtrazado);
            imoveis.add(imovel);
            System.out.println("Você quer inserir mais um imovel? digite 1 para sim ou 0 para não");
            rodar = sc.nextInt();

        }while (rodar == 1);

        System.out.println("Quantidade de imoveis: " + imoveis.size());
        System.out.println("Somatoria do Imposto original: " + somarImpostoOriginal(imoveis));
        System.out.println("Somatório da multa: " + somarMultas(imoveis));
        System.out.println("Somatório dos juros: " + somarJuros(imoveis));
        System.out.println("Somatório  do valor do imposto acrescido de juros e multas: " + somarMultaCompleta(imoveis));
    }
}
