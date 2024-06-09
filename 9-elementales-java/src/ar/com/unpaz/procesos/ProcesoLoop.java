package ar.com.unpaz.procesos;

public class ProcesoLoop extends Thread{
	public void run() {
		
		System.out.println("Inicio ProcesoLoop");
		for(int i =0; i<5; i++) {
			System.out.println("ProcesoLoop: " + i);
			try {
				ProcesoLoop.sleep(1000); // el hilo se bloquea --> not runnable				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
