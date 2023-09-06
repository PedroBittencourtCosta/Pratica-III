package Streams;

import java.io.LineNumberInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4,5,6);


        // usar o consumer com expressao lambda para imprimir numeros pares;
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };


        // Usar o Consumer para imprimir numeros pares no Stream;
        num.stream().forEach(imprimirNumeroPar);
        // agora com lambda
        num.stream().forEach(n -> { if(n % 2 == 0) System.out.println(n);});

    }
}
