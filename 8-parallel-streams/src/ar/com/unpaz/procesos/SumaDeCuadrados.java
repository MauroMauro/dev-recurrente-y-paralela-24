package ar.com.unpaz.procesos;

import java.util.stream.*;

public class SumaDeCuadrados {
	
	public void run() {
		
	    int sumaDeCuadrados = IntStream.rangeClosed(1, 100)
	                                   .parallel() 
	                                   .map(n -> n * n) 
	                                   .sum(); 

	   
	    System.out.println("La suma de los cuadrados de los números del 1 al 100 es: " + sumaDeCuadrados);
	}    
    
}
