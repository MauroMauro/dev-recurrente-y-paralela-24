package ar.com.unpaz.prueba1;

import java.util.Arrays;
import java.util.List;

public class Prueba1 {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("a","b","c","d","e");
		
		//se transforma la lista en stream
		lista.stream();
				
		System.out.println(lista.stream().findFirst());
		
		List<String> lista1 = Arrays.asList("a","b","c","d","e");
		
		//se transforma la lista en stream
		lista1.stream().filter(f->f.startsWith("a"));

				
		System.out.println(lista1.stream().filter(f->f.startsWith("a")));
		
		
		
		

	}

}
