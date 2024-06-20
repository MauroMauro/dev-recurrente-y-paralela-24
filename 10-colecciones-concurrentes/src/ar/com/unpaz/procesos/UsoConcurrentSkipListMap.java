package ar.com.unpaz.procesos;

import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListMap;

public class UsoConcurrentSkipListMap {
	public void run() {
		final var m = new ConcurrentSkipListMap<String, Integer>(Comparator.reverseOrder());
		m.put("a", 10);
		m.put("b", 20);
		m.put("c", 30);

		System.out.println("Lista => "+m);

		final var map = new ConcurrentSkipListMap<>(m);
		System.out.println("Lista pasada como parámetro==> "+map); 
	}
}
