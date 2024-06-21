package ar.com.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoRepositorio {
	
	public void run() {		
		try {
			FileReader sFileReader = new FileReader("archivos/Cliente.txt");
			BufferedReader sBufferedReader = new BufferedReader(sFileReader);
			
			String linea;
			while((linea = sBufferedReader.readLine() )!=null) {
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
		
}
