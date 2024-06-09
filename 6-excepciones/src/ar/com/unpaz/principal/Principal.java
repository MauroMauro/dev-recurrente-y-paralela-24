	package ar.com.unpaz.principal;

import java.io.IOException;

import ar.com.unpaz.procesos.Division;
import ar.com.unpaz.repositorio.LeerArchivoRepositorio;

public class Principal {

	public static void main(String[] args) {
		
		LeerArchivoRepositorio lectura = new LeerArchivoRepositorio();
		
		// EXCEPCIONES VERIFICADAS
		//Lectura de archivo que implementa tratamiento de excepciones con bloque try-catch
		lectura.leerManejoTryCatch("archivos/Cliente.txt");
		
		//Lectura de archivo que implementa tratamiento de excepciones con throw
		try {
			lectura.leerManejoThrow("archivos/Cliente.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// EXCEPCIONES NO VERIFICADAS
		Division division = new Division();
		division.dividir(0, 1);
		
		
		
		
	}

}
