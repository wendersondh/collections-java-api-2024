package Stream_API;

import java.util.Arrays;
import java.util.List;

public class Desafio4 {
    //Desafio 4 - Remova todos os valores ímpares

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, -4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 0);

        List<Integer> numerosParesComZero = numeros.stream().filter(n -> n % 2 == 0).toList();

        numerosParesComZero.forEach(System.out::println);
    }

}