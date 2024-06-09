package Stream_API;

import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    //Desafio 1 - Mostre a lista na ordem numérica
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().sorted().forEach(n -> System.out.print(n + " "));

    }
}
