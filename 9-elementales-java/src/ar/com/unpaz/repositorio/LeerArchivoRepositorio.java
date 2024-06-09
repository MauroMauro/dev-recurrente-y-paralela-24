package ar.com.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoRepositorio {
	
	public void run() {
		try {
			FileReader sReadFile = new FileReader("archivos/Cliente.txt");
			BufferedReader sBufferedReader = new BufferedReader(sReadFile);
			
			String linea;
			while((linea = sBufferedReader.readLine()) != null) {
				System.out.println(linea);
			}
			
		}catch (IOException e) {
			System.out.println(e);
		}
	}
		
}
