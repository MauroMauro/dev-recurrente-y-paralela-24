package ar.com.unpaz.procesos;

import ar.com.unpaz.repositorio.LeerArchivoRepositorio;

public class LeerArchivo extends Thread{
	public void run () {
		System.out.println("Inicio de proceso de lectura de archivo");
		LeerArchivoRepositorio sLeerArchivoRepositorio = new LeerArchivoRepositorio();
		sLeerArchivoRepositorio.run();
	}
}
