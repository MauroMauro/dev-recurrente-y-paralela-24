package ar.com.unpaz.procesos;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MaximoDeListaParalellStreams {
	public void run() {
		List<Integer> lista = new ListaAleatoria().generarLista();		
		System.out.println(lista);
		
		//MÉTODO 1
		System.out.println(lista.parallelStream().max(Integer::compare));
		
		//MÉTODO 2
		System.out.println(Collections.max(lista));				
		
		//MÉTODO 3
		List<Integer> listaAleatoria = new Random().ints(10,1,50)
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println(listaAleatoria);
		System.out.println(Collections.max(listaAleatoria));
		
	}
}
