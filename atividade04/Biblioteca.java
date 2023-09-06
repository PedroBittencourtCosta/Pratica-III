package atividade04;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<ItemBiblioteca> bibliotecaList;

    public Biblioteca(){
        this.bibliotecaList = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca itemBiblioteca){
        bibliotecaList.add(itemBiblioteca);
    }

    public void listarTodosItens(){
        System.out.println(bibliotecaList);
    }

    public List<ItemBiblioteca> getBibliotecaList() {
        return bibliotecaList;
    }
}
