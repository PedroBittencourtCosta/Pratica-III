package atividade04;

public class Teste {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("Ceifador", 2018, "Neal");
        Revista revista = new Revista("Oboticario", 2023, 3);
        ItemBiblioteca item = new ItemBiblioteca("Harry potter", 2013);

        biblioteca.adicionarItem(item);
        biblioteca.adicionarItem(item);
        biblioteca.adicionarItem(livro);
        biblioteca.adicionarItem(revista);
        biblioteca.adicionarItem(revista);

        biblioteca.listarTodosItens();

        Usuario usuario = new Usuario("Pedro");
        usuario.pegarItem("Harry potter", biblioteca);

        biblioteca.listarTodosItens();
        System.out.println(usuario.getItemUsuarioList());
        System.out.println("/////////////////////////////////////////////////////////////////////////////");

        usuario.devolverItem("Harry potter", biblioteca);
        biblioteca.listarTodosItens();
        System.out.println(usuario.getItemUsuarioList());

        biblioteca.getBibliotecaList().forEach(i -> System.out.println(i.getTitulo()));
    }
}
