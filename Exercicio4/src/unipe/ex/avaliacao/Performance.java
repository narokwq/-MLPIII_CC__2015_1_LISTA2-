package unipe.ex.avaliacao;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Performance {
	public static void main(String[] args){
		int valores = 1000000;
		Set<Integer> numeros = new TreeSet<>();
		Set<Integer> numeros2 = new LinkedHashSet<>();
		
		//	TreeSet	
		long tInicio = System.currentTimeMillis();		
		for (int i = 0; i < valores; i++) {
			numeros.add(i);
		}
		for (int i = valores; i > valores; i--) {
			numeros.contains(i);
		}
		long tFim = System.currentTimeMillis();
		
		//	LinkedHashSet	
		long lInicio = System.currentTimeMillis();
		for (int i = 0; i < valores; i++) {
			numeros2.add(i);
		}
		for (int i = valores; i > valores; i--) {
			numeros2.contains(i);
		}
		long lFim = System.currentTimeMillis();
		
		//	Print
		System.out.println("TreeSet: "+(tFim-tInicio));
		System.out.println("LinkedHashSet: "+(lFim-lInicio));
	}
}
