package ar.com.unpaz.procesos;

public class Proceso2 extends Thread {
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Proceso 2 " + i);
			try {
				Proceso2.sleep(1000); // el hilo se bloquea --> not runnable	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
