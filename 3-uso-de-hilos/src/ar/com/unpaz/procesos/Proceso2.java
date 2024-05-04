package ar.com.unpaz.procesos;

public class Proceso2 implements Runnable {
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Proceso 2 " + i);
		}
	}
}
