package atividade04;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private List<ItemBiblioteca> itemUsuarioList;

    public Usuario(String nome) {
        this.nome = nome;
        itemUsuarioList = new ArrayList<>();
    }

    public void pegarItem(String titulo, Biblioteca biblioteca){
        if(!biblioteca.getBibliotecaList().isEmpty()){
            ItemBiblioteca itemBiblioteca = null;
            for(ItemBiblioteca item : biblioteca.getBibliotecaList()){
                if(item.getTitulo().equalsIgnoreCase(titulo)){
                    itemBiblioteca = item;
                    break;
                }
            }
            biblioteca.getBibliotecaList().remove(itemBiblioteca);
            itemUsuarioList.add(itemBiblioteca);
        }else {
            System.out.println("O livro não esta disponivel no momento");
        }
    }

    public void devolverItem(String titulo, Biblioteca biblioteca){
        if(!itemUsuarioList.isEmpty()){
            ItemBiblioteca itemBiblioteca = null;
            for(ItemBiblioteca item: itemUsuarioList){
                if(item.getTitulo().equalsIgnoreCase(titulo)){
                    itemBiblioteca = item;
                    break;
                }
            }
            itemUsuarioList.remove(itemBiblioteca);
            biblioteca.getBibliotecaList().add(itemBiblioteca);
        }else{
            System.out.println("Você não possui itens");
        }

    }

    public List<ItemBiblioteca> getItemUsuarioList() {
        return itemUsuarioList;
    }
}
