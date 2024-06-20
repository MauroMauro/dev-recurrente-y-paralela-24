package ar.com.unpaz.procesos;

import java.util.concurrent.ConcurrentLinkedDeque;

public class UsoConcurrentLinkedDeque {
	public void run() {
		final var deque = new ConcurrentLinkedDeque<String>();
		System.out.println("Deque: " + deque); 
		System.out.println(deque.isEmpty());

		deque.addLast("aaa");
		deque.addLast("bbb");
		deque.addLast("ccc");

		System.out.println("Deque después de add: " + deque);
		System.out.println("Tamaño de Deque: " + deque.size());
	}
}
