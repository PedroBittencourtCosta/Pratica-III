package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos(){
        estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueMap.put(cod, new Produto(nome,quantidade,preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        if(!estoqueMap.isEmpty()){
            for(Produto produto: estoqueMap.values()){
                valorTotal += produto.getPreco() * produto.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = 0;
        for(Produto produto: estoqueMap.values()){
            if (produto.getPreco() > maiorPreco){
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }


    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "abacate", 3, 40);
        estoque.adicionarProduto(14L, "abacaxi", 1, 20);
        estoque.adicionarProduto(13L, "abacaxi", 1, 10);

        System.out.println(estoque.obterProdutoMaisCaro());

    }


}
