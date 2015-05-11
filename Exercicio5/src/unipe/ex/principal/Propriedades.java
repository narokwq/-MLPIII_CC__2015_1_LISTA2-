package unipe.ex.principal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class Propriedades {
	public static void main(String[] args){
		Properties propBanco = new Properties();
		try {
			propBanco.load(new FileInputStream("src/unipe/ex/resources/database.properties"));
			
			for (Entry<Object, Object> valores : propBanco.entrySet()) {
				System.out.println(valores.getKey()+" : "+valores.getValue());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
