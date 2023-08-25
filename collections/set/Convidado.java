package collections.set;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int codigoConvidado;

    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvidado=" + codigoConvidado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvidado == convidado.codigoConvidado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoConvidado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    public void setCodigoConvidado(int codigoConvidado) {
        this.codigoConvidado = codigoConvidado;
    }


}
