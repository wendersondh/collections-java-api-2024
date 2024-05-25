package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                soma += numero;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if(numero > maior){
                    maior = numero;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if(numero < menor){
                    menor = numero;
                }
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(numeros);
        }else {
            System.out.println("Lista vazia");
        }

    }

    public static void main(String[] args) {
        // Criando uma instância do somaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        //Adicionando números a lista
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(1);

        //soma de todos os numeros
        System.out.println(somaNumeros.calcularSoma());

        //maior número da lista
        System.out.println("Maior número " + somaNumeros.encontrarMaiorNumero());

        //menor número da lista
        System.out.println("Menor número " + somaNumeros.encontrarMenorNumero());

        //exibir todos os números
        somaNumeros.exibirNumeros();
    }
}
