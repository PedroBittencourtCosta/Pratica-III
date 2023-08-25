package collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoList;

    public ConjuntoConvidados() {
        this.convidadoList = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoList.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        for(Convidado convidado: convidadoList){
            if(convidado.getCodigoConvidado() == codigoConvite){
                convidadoList.remove(convidado);
                break;
            }
        }
    }

    public void contarConvidados(){
        System.out.println(convidadoList.size());
    }

    public void exibirConvidados(){
        System.out.println(convidadoList);
    }

    public static void main(String[] args) {

        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("pedro", 12345);
        convidados.adicionarConvidado("lucas", 1245);
        convidados.adicionarConvidado("joao", 1234);
        convidados.adicionarConvidado("maria", 12345);


        convidados.removerConvidadoPorCodigoConvite(1234);
        convidados.exibirConvidados();
        convidados.contarConvidados();
    }

}
