package collections.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatos;

    public AgendaContatos(){
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatos.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatos.isEmpty()){
            agendaContatos.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatos);
    }

    public Integer pesquisarPorNome(String nome){
        if(!agendaContatos.isEmpty()){
            return agendaContatos.get(nome);
        }
        return null;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();



        agendaContatos.exibirContatos();
    }
}
