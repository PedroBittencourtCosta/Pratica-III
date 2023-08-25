package collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigo, int preco, int qtd){
        produtoSet.add(new Produto(nome, codigo, preco, qtd));
    }

    public Set<Produto> exibirProdutosPorNome(){
        return new TreeSet<>(produtoSet);
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto("lapis", 8900 , 2, 23);
        cadastroProdutos.adicionarProduto("matyghgyghgfffff", 83300 , 82, 754);
        cadastroProdutos.adicionarProduto("caneta", 80 , 5, 45);
        cadastroProdutos.adicionarProduto("lapis", 8900 , 2, 23);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println("----------------");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("----------------");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println("----------------");

    }
}
