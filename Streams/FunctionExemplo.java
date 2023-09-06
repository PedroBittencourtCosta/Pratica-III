package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionExemplo {
    public static void main(String[] args) {

        List<Integer> listnum = Arrays.asList(1,2,3,4,5,6);

        // Usar a function com expressão lambda para dobrar todos os numeros;
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usando a function para dobrar os numeros e armazenalos em uma list;
        List<Integer> numerosDobrados = listnum.stream().map(dobrar).toList();
        List<Integer> dobrados = listnum.stream().map(n -> n * 2).toList();


        numerosDobrados.forEach(n -> System.out.print(n));
        System.out.println();
        dobrados.forEach(n -> System.out.print(n));
    }
}
