package unipe.ex.principal;

import unipe.ex.inventario.Inventario;
import unipe.ex.produto.Item;

public class Principal {

	public static void main(String[] args) {
		Inventario inventario1 = new Inventario();
		Item item1 = new Item(0001,"Memoria");
		Item item2 = new Item(0002,"CPU");
		Item item3 = new Item(0003,"Placa Mãe");
		
		inventario1.addItem(item2);
		inventario1.addItem(item1);
		inventario1.addItem(item3);
		
		System.out.println(inventario1);
		if(inventario1.estaVazia()){
			System.out.println("Inventario Vazio.");
		}else{
			System.out.println("O inventario possui "+ inventario1.tamanho() +" itens");
		}
		
		if(inventario1.existe(item1)){
			System.out.println("O item esta no inventario.");
		}else{
			System.out.println("O item não esta no inventario.");
		}
	}

}
