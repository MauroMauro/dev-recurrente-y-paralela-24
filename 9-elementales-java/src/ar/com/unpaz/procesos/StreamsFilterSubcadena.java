package ar.com.unpaz.procesos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterSubcadena extends Thread {
	public void run() {
		List<String> lista = Arrays.asList("jujuy", "salta ", "neuquen", "mendoza", "cordoba", "catamarca", "tucuman", "corrientes", "misiones");
		List<Integer> listaNros = Arrays.asList(1,2,3,4,5,6,7,8,9);
				
		List<String> listaFiltrados = lista.parallelStream()
										.filter(f -> f.contains("es"))
										.collect(Collectors.toList());
		
		System.out.println("Ejecutado StreamsFilterSubcadena \nfilter: " + listaFiltrados);
		
		Integer listaReducidos = listaNros.parallelStream()
									.reduce(0, (a,b)-> a+b);
		System.out.println("reduce: " + listaReducidos);
		
		List<Integer> listaMapeados = listaNros.parallelStream()
									.map(n -> n*n)
									.collect(Collectors.toList());
		System.out.println("map: " + listaMapeados);
		
		
		
	}
}
