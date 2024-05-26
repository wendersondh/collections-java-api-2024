package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        if(!numeros.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.numeros);
        if(!numeros.isEmpty()){
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else {
            System.out.println("A lista está vazia!");
        }
    }



    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(5);

        // Exibindo a lista de números adicionados
        ordenacaoNumeros.exibirNumeros();

        //Ordem Ascendente

        System.out.println(ordenacaoNumeros.ordenarAscendente());

        //Ordem Descendente
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
