package collections.set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato: contatoSet){
            if(contato.getNome().startsWith(nome)){ // o startsWith é um metodo que busca tudo que comece com a variavel que eu colocar como argumento;
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        for(Contato contato: contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                break;
            }
        }
    }

    public static void main(String[] arg){

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Julia", 649877829);
        agendaContatos.adicionarContato("Pedro", 64929);
        agendaContatos.adicionarContato("Maria", 77829);
        agendaContatos.adicionarContato("Pedro Ramos", 829);
        agendaContatos.adicionarContato("Pedro Joao", 9786829);
        agendaContatos.adicionarContato("Joao Pedro ", 29);

        agendaContatos.exibirContatos();

        System.out.println("-----------------------------------------------");
        agendaContatos.atualizarNumeroContato("Julia", 456);

        agendaContatos.exibirContatos();

        System.out.println("-----------------------------------------------");

        System.out.println(agendaContatos.pesquisarPorNome("Pedro"));
    }
}
