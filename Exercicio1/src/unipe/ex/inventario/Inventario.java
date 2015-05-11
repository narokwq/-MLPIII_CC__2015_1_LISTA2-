package unipe.ex.inventario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import unipe.ex.produto.Item;

public class Inventario {
	private List<Item> itens;
	
	public Inventario(){
		itens = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		itens.add(item);
		Collections.sort(itens);
	}
	
	public boolean estaVazia(){
		return itens.isEmpty();
	}
	
	public int tamanho(){
		return itens.size();
	}
	
	public boolean existe(Item item){
		return itens.contains(item);		
	}
	
	
	@Override
	public String toString() {
		return itens.toString();
	}
	
	
}
