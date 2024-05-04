package ar.com.unpaz.principal;

import ar.com.unpaz.procesos.*;

public class principal {
	public static void main(String[] args){
		Proceso1 hilo1 = new Proceso1(); //new: el hilo se crea, pero no se inicializa
		Proceso2 hilo2 = new Proceso2();
		Proceso3 hilo3 = new Proceso3();
		Proceso4 hilo4 = new Proceso4();
		
		hilo1.start(); // se inicializa el hilo, pasa a estado Runnable
		hilo2.start();
		//hilo1.stop(); Si se quiere matar al hilo 1
		hilo3.start();
		hilo4.start();
	}	
}
