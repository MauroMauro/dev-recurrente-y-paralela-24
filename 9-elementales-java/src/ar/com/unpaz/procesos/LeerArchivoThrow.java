package ar.com.unpaz.procesos;

import java.io.IOException;

import ar.com.unpaz.repositorio.LeerArchivoThrowExcRepositorio;

public class LeerArchivoThrow extends Thread{
	public void run(){
		System.out.println("Inicio de proceso de lectura de archivo con manejo throw IOException");

		LeerArchivoThrowExcRepositorio sLeerArchivoThrowExcRepositorio = new LeerArchivoThrowExcRepositorio();
		try {
			sLeerArchivoThrowExcRepositorio.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
