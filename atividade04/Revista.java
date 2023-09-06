package atividade04;

public class Revista extends ItemBiblioteca{

    private int edicao;

    public Revista(String titulo, int anoPublicado, int edicao) {
        super(titulo, anoPublicado);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
