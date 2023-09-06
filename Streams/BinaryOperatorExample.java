package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        // usar o BinaryOperator para somar dois numeros;
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // usando ele
        int resultado = numeros.stream().reduce(0,(num1, num2) -> num1 + num2);

        System.out.println(resultado);

    }
}
