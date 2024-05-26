package ar.com.unpaz.procesos;

public class ProcesoPresentarMensaje extends Thread {

	public void run () {
		try {
			ProcesoPresentarMensaje.sleep(1000);
			System.out.println("Corriendo ProcesoPresentarMensaje");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
