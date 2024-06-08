package ar.com.unpaz.procesos;

import java.util.List;
import java.util.stream.*;




public class NumerosPrimos {
	public void run(int inicio, int fin) {
        
        List<Integer> primos = IntStream.rangeClosed(inicio, fin)
                                        .parallel()
                                        .filter(NumerosPrimos::esPrimo)
                                        .boxed() // Convierte IntStream a Stream<Integer>
                                        .collect(Collectors.toList()); 

        System.out.println("rango: " + inicio + " a " + fin + " ==> nros primos: " + primos);
	}
	
	public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	
}
