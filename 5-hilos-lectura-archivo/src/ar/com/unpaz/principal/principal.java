package ar.com.unpaz.principal;

import ar.com.unpaz.procesos.*;

public class principal {
	public static void main(String[] args){
		ProcesoLecturaTXT hilo1 = new ProcesoLecturaTXT(); //new: el hilo se crea, pero no se inicializa
		ProcesoPresentarMensaje hilo2 = new ProcesoPresentarMensaje();
		
		hilo1.start(); // se inicializa el hilo, pasa a estado Runnable
		
		hilo2.start();
		
	}	
}
