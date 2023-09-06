package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExemplo {

    static String filter(String a){
        return a.length() > 5 ? a : null;
    }

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Java", "JavaScript", "python", "luisiana", "macacheira","c++");

        Predicate<String> maisDeCincoCaractere = palavra -> palavra.length() > 5;

        palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);



       if( !palavras.stream().allMatch(p -> p.startsWith("J"))){
           System.out.println("nao atende");
       }

        if(palavras.stream().filter(p -> p.length() > 5).anyMatch(p -> p.startsWith("p"))){
            System.out.println("achei");
        }
    }
}
