package collections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new  ArrayList<>();
    }

    public void adicionarItem(String nome, int preco, int quantidade){
        itemList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerItems = new ArrayList<>();
        for(Item item : itemList){
            if(item.getNome() == nome){
                removerItems.add(item);
            }
        }
        itemList.removeAll(removerItems);
    }

    public int calcularValorTotal(){
        int valorTotal = 0;
        for(Item item : itemList){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("celular", 4000, 7);
        carrinho.adicionarItem("fogao", 1500, 13);
        carrinho.adicionarItem("camisa", 80, 45);

        carrinho.exibirItens();

        carrinho.removerItem("celular");

        carrinho.exibirItens();

        System.out.println(carrinho.calcularValorTotal());

    }

}
