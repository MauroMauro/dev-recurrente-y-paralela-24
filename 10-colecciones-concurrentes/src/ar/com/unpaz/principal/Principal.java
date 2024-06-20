package ar.com.unpaz.principal;

import ar.com.unpaz.procesos.UsoConcurrentHashMap;
import ar.com.unpaz.procesos.UsoConcurrentLinkedDeque;
import ar.com.unpaz.procesos.UsoConcurrentSkipListMap;
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
		
		System.out.println( "\n---------------\n");
		
		System.out.println("\nUSO DE ConcurrentLinkedDeque");
		System.out.println("\nEjemplo de uso de ConcurrentLinkedDeque");
		
		UsoConcurrentLinkedDeque sUsoConcurrentLinkedDeque = new UsoConcurrentLinkedDeque();
		sUsoConcurrentLinkedDeque.run();
		
		System.out.println( "\n---------------\n");
		
		System.out.println("\nUSO DE ConcurrentSkipListMap");
		System.out.println("\nEjemplo de uso de ConcurrentSkipListMap");
		
		UsoConcurrentSkipListMap sConcurrentSkipListMap = new UsoConcurrentSkipListMap();
		sConcurrentSkipListMap.run();

	}

}
