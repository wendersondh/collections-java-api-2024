package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPotAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("carlos", 21, 1.72);
        ordenacaoPessoas.adicionarPessoa("jose", 19, 1.70);
        ordenacaoPessoas.adicionarPessoa("maria", 20, 1.68);
        ordenacaoPessoas.adicionarPessoa("joaquina", 25, 1.65);

        //lista na ordem de adição
        System.out.println(ordenacaoPessoas.pessoaList);

        //lista na ordem por idade
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        //lista na ordem por altura
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
