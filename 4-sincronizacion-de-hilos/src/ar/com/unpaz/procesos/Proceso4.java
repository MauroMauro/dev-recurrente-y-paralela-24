package ar.com.unpaz.procesos;

public class Proceso4 extends Thread {
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Proceso 4 " + i);
			try {
				Proceso4.sleep(1000); // el hilo se bloquea --> not runnable	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
