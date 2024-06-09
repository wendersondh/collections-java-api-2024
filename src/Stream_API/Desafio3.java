package Stream_API;


import java.util.Arrays;
import java.util.List;



public class Desafio3 {
    //Desafio 3 - Verifique se todos os números da lista são positivos:

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, -3, -4, 5, -6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares;

        // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
        numerosPares = numeros.stream().filter(n -> n > 0).toList();

        // Imprimir a lista de números pares
        numerosPares.forEach(System.out::println);
    }

}
