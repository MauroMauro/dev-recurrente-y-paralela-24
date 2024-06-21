package ar.com.unpaz.procesos;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ParesImparesParallelStreams {
	public void run() {
		List<Integer> lista = new Random().ints(10,1,50)
				.boxed()
				.collect(Collectors.toList());
		
		List<Integer> pares = lista.parallelStream()
								.filter(n -> n % 2 == 0)
								.collect(Collectors.toList());
		
		List<Integer> impares = lista.parallelStream()
				.filter(n -> n % 2 != 0)
				.collect(Collectors.toList());
		
		System.out.println("Pares: " + pares);
		System.out.println("Impares: " + impares);
		
	}
}
