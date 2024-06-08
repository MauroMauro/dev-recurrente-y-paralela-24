package ar.com.unpaz.procesos;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ProductoDeNumerosAleatorios {
	public void run() {

        List<Integer> numeros = new Random().ints(5, 1, 10) //se generan 5 nums del 1 al 10
                                             .boxed() // Convierte IntStream a Stream<Integer>
                                             .collect(Collectors.toList());

        Integer producto = numeros.parallelStream()
                               .reduce(1, (a, b) -> a * b);

        System.out.println("Producto de los números: " + numeros+ " ==> " + producto);
	}
}
