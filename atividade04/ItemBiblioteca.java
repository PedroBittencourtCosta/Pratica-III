package atividade04;


import java.util.Objects;

public class ItemBiblioteca {

    private String titulo;
    private int anoPublicado;

    public ItemBiblioteca(String titulo, int anoPublicado) {
        this.titulo = titulo;
        this.anoPublicado = anoPublicado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemBiblioteca that = (ItemBiblioteca) o;
        return Objects.equals(titulo, that.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    @Override
    public String toString() {
        return "ItemBiblioteca{" +
                "titulo='" + titulo + '\'' +
                ", anoPublicado=" + anoPublicado +
                '}';
    }

    public  void exibirDetalhes(){
        System.out.println(getTitulo());
        System.out.println(getAnoPublicado());
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }
}
