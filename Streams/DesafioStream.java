package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesafioStream {

    // Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
    public static void mostrarLista(List<Integer> listaNum){
        if(!listaNum.isEmpty()){
            listaNum.stream().sorted().forEach(System.out::print);
        }
    }

    //Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
    public static Integer somarPares(List<Integer> lista){
        if(!lista.isEmpty()){
            return lista.stream().filter(n -> n % 2 == 0).reduce(0, (n1, n2) -> n1 + n2);
        }
        return null;
    }

    //Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
    public static boolean positivosOuNao(List<Integer> lista){
        return lista.stream().allMatch(n -> n >= 0);
    }

    //Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
    public static void removerImpares(List<Integer> lista){
        List<Integer> newList = new ArrayList<>(lista);
        newList.removeAll(newList.stream().filter(n -> !(n % 2 == 0)).toList());
        System.out.println(newList);
    }

    // Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
    public static double calcularMedia(List<Integer> lista){
        return (double) (lista.stream().filter(n -> n > 5).reduce(0, Integer::sum)) / lista.stream().filter(n -> n > 5).toList().size();
    }

    // Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
    public static boolean verificarNum(List<Integer> lista){
        return lista.stream().anyMatch(n -> n > 10);
    }

    // Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
    public static int segundoMaior(List<Integer> lista){
        return lista.stream().sorted().toList().get(lista.size() - 2);
    }

    //Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
    public static int somarTodos(List<Integer> lista){
        return lista.stream().reduce(0, Integer::sum);
    }

    // Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
    public static boolean verificarDistintos(List<Integer> lista){
        return lista.stream().distinct().count() == lista.size();
    }

    // Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
    public  static List<Integer> imparesMultiplosde3E5(List<Integer> lista){

        return lista.stream().filter(n ->!( n % 2 == 0)).filter(n -> n % 3 == 0 || n % 5 == 0).toList();
    }

    // Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

    // Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
    public static int produtoDosNumeros(List<Integer> lista){
       return 0;
    }

    //Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
    public static List<Integer> filtrarIntervalo(List<Integer> lista, int numInicial, int numFinal){
        return lista.stream().filter(n -> n > numInicial && n < numFinal).toList();
    }
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,5, 4, 3);

        // 1
        mostrarLista(numeros);
        //2
        System.out.println("\n" + somarPares(numeros));
        //3
        System.out.println(positivosOuNao(numeros));
        //4
        removerImpares(numeros);
        //5
        System.out.println(calcularMedia(numeros));
        //6
        System.out.println(verificarNum(numeros));
        //7
        System.out.println(segundoMaior(numeros));
        //8
        System.out.println(somarTodos(numeros));
        //9
        System.out.println(verificarDistintos(numeros));
        //10
        System.out.println(imparesMultiplosde3E5(numeros));
        //12
        System.out.println(produtoDosNumeros(numeros));
        //13
        System.out.println(filtrarIntervalo(numeros, 5, 10));

    }
}
