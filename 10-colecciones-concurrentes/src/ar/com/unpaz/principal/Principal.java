package ar.com.unpaz.principal;

import ar.com.unpaz.procesos.UsoConcurrentHashMap;
import ar.com.unpaz.procesos.UsoCopyOnWriteArrayList;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("\nUSO DE ConcurrentHashMap");
		System.out.println("\nEjemplo de uso de ConcurrentHashMap");
		
		UsoConcurrentHashMap sUsoConcurrentHashMap = new UsoConcurrentHashMap();		
		sUsoConcurrentHashMap.run();
		
		
		System.out.println("\nEjemplo de uso de ConcurrentHashMap en paralelo");
		sUsoConcurrentHashMap.runParalelo();
		
		System.out.println( "\n---------------\n");
		
		System.out.println("\nUSO DE UsoCopyOnWriteArrayList");
		System.out.println("\nEjemplo de uso de UsoCopyOnWriteArrayList");
		
		UsoCopyOnWriteArrayList sUsoCopyOnWriteArrayList = new UsoCopyOnWriteArrayList();
		sUsoCopyOnWriteArrayList.run();

	}

}
