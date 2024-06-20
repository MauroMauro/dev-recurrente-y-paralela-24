package ar.com.unpaz.procesos;

import java.util.concurrent.ConcurrentHashMap;

public class UsoConcurrentHashMap {
	
	public void run() {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("A", 1);
		map.putIfAbsent("B", 2);
		map.computeIfAbsent("C", k -> 3);
		map.computeIfPresent("A", (k, v) -> v + 1);
		map.merge("B", 3, (oldVal, newVal) -> oldVal + newVal);
		
		//Recorrido en paralelo
		map.forEach(1, (k, v) -> System.out.println(k + ": " + v));
		
		/*
		computeIfAbsent: Si la clave especificada no está ya asociada con un valor, intenta calcular su valor utilizando una función de mapeo proporcionada.
		computeIfPresent: Si la clave especificada está presente, intenta recalcular su valor utilizando una función de remapeo.
		merge: Combina el valor existente con un nuevo valor utilizando una función de combinación.
		*/


	}
	
}
