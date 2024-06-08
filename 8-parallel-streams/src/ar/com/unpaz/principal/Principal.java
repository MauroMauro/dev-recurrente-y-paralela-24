package ar.com.unpaz.principal;

import ar.com.unpaz.procesos.SumaDeCuadrados;

public class Principal {

	public static void main(String[] args) {
		// Enunciado 1: "Implementa un programa en Java que utilice parallel streams para calcular la suma de los cuadrados de los números enteros del 1 al 100 de manera paralela."
		SumaDeCuadrados sumaDeCuadrados = new SumaDeCuadrados();
		sumaDeCuadrados.run();
	

		// Enunciado 2: "Desarrolla una aplicación en Java que procese una lista de strings y busque las palabras que contienen una determinada subcadena utilizando parallel streams para mejorar la eficiencia del proceso."

		// Enunciado 3: "Escribe un programa en Java que utilice parallel streams para calcular el producto de los elementos de una lista de números enteros generados aleatoriamente y mostrar el resultado por pantalla."

		// Enunciado 4: "Crea una aplicación en Java que utilice parallel streams para encontrar los números primos en un rango dado y mostrarlos en orden ascendente, aprovechando la capacidad de procesamiento paralelo para mejorar el rendimiento del cálculo."

	}

}
