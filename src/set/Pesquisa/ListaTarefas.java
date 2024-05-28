package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        }else {
            System.out.println("o conjunto está vazio");
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.isConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(!t.isConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                    break;
                }
            }
        }else {
            System.out.println("o conjunto está vazio");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(false);
                    break;
                }
            }
        }else {
            System.out.println("o conjunto está vazio");
        }
    }

    public void limparListaTarefas(){
        if(!tarefaSet.isEmpty()){
            tarefaSet.clear();
        }else {
            System.out.println("o conjunto está vazio");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        //adicionando tarefas
        listaTarefas.adicionarTarefa("bootcamp java");
        listaTarefas.adicionarTarefa("beta hub");
        listaTarefas.adicionarTarefa("exercicios javascript");
        listaTarefas.adicionarTarefa("desafio de código");
        listaTarefas.adicionarTarefa("projeto final");

        //exibindo a quantidade de tarefas
        System.out.println(listaTarefas.contarTarefas()+ " tarefa(s)");

        //exibindo todas as tarefas
        listaTarefas.exibirTarefas();

        //marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("bootcamp java");
        listaTarefas.marcarTarefaConcluida("beta hub");
        listaTarefas.marcarTarefaConcluida("projeto final");

        //exibindo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        //mancando tarefa concluída como pendente
        listaTarefas.marcarTarefaPendente("projeto final");

        //exibindo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        //removendo uma tarefa
        listaTarefas.removerTarefa("exercicios javascript");

        //exibindo a quantidade de tarefas
        System.out.println(listaTarefas.contarTarefas()+ " tarefa(s)");

        //limpando lista de tarefas
        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();

    }
}



