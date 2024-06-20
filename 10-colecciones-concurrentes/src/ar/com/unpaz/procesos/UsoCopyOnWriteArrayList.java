package ar.com.unpaz.procesos;

import java.util.concurrent.CopyOnWriteArrayList;

public class UsoCopyOnWriteArrayList {
	public void run() {
		CopyOnWriteArrayList<String> lista = new CopyOnWriteArrayList<>();
	    lista.add("Elemento 1");
	    lista.add("Elemento 2");

	    // Lectura concurrente segura
	    for (String item : lista) {
	        System.out.println(item);
	    }

	    // Modificación concurrente segura
	    lista.add("Elemento 3");
	    
	 // Lectura concurrente segura
	    for (String item : lista) {
	        System.out.println(item);
	    }
	}
}
