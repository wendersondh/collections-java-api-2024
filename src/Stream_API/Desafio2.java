package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio2 {
    //Desafio 2 - Imprima a soma dos números pares da lista
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //criando uma lista vazia para numeros pares
        List<Integer> numerosPares = new ArrayList<>();

        //adicionando na lista os numeros pares presentes na lista numeros
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                numerosPares.add(n);
            }
        });

        //somando todos os números no Stream
        int resultado = numerosPares.stream().reduce(0, Integer::sum);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }
}
