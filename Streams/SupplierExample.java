package Streams;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {

        // Usar o Supplier com exoressão lambda para fornencer uma saudaçao personalizada;
        Supplier<String> saudacao = () -> "Hola eu sou o goku";

        // Usar o Supplier para obter uma lista com 5 saudações;
        List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).toList();
        List<String> listaSaludos =Stream.generate( () -> "Oi vidaa").limit(3).toList();

        // imprimir
        listaSaudacoes.forEach(n -> System.out.println(n));
        listaSaludos.forEach(n -> System.out.println(n));

    }
}
