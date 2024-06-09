package ar.com.unpaz.principal;

import ar.com.unpaz.procesos.LeerArchivo;
import ar.com.unpaz.procesos.ProcesoLoop;

public class Principal {

	public static void main(String[] args) {
		
		ProcesoLoop hiloProcesoLoop = new ProcesoLoop();
		LeerArchivo hiloLeerArchivo = new LeerArchivo();
		
		
		hiloProcesoLoop.start();
		hiloLeerArchivo.start();
		
		
		

	}

}
