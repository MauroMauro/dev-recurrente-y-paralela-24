package ar.com.unpaz.repositorio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LeerArchivoRepositorio {
	
	public void leerManejoTryCatch(String url) {
		File sFile = new File(url);
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			System.out.println("Leido - manejo de excepciones con try-catch");
			
			int content;
	        while ((content = sFileReader.read()) != -1) {
	            System.out.print((char) content);
	        }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public void leerManejoThrow(String url) throws IOException {
		File sFile = new File(url);
		FileReader sFileReader;
		sFileReader = new FileReader(sFile);
		System.out.println("\nLeido - manejo de excepciones con throw");
		
		int content;
        while ((content = sFileReader.read()) != -1) {
            System.out.print((char) content);
        }
        
		sFileReader.close();
	}
}
