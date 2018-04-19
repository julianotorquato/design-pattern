package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private double valor;
    private List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        itens = new ArrayList<Item>();
    }
    public double getValor() {
        return valor;
    }
    
    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }
    
    public void addItem(Item item){
        itens.add(item);
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
}
