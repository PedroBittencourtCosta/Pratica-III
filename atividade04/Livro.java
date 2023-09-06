package atividade04;

public class Livro extends ItemBiblioteca{

    private String autor;

    public Livro(String titulo, int anoPublicado, String autor) {
        super(titulo, anoPublicado);
        this.autor = autor;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
