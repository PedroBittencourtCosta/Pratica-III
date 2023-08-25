package collections.set;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefaSet.add(tarefa);
    }

    public void removerTarefa(String descricao){
        for(Tarefa tarefa: tarefaSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaSet.remove(tarefa);
                break;
            }
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
        for(Tarefa tarefa: tarefaSet){
            if(tarefa.getTarefaFeita()){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tarefa: tarefaSet){
            if(!tarefa.getTarefaFeita()){
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa tarefa: tarefaSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setTarefaFeita(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa tarefa: tarefaSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setTarefaFeita(false);
                break;
            }
        }
    }
}
