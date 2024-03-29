package ar.com.unpaz.repositorio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.crud.Funcionalidades;
import ar.com.unpaz.model.Vial;

public class LeerArchivoVialRepositorio implements Funcionalidades {
	@Override
	public List<Vial> getListViales() {
		
		File sFile = new File("archivo/vial.csv");
		List<Vial> sListVial = new ArrayList<Vial>();
		FileReader sFileReader;
		try {
			sFileReader = new FileReader (sFile);
			@SuppressWarnings("resource")
			BufferedReader sBufferedReader = new BufferedReader(sFileReader);
			String linea = "";
			while((linea = sBufferedReader.readLine()) != null) {
				String data [] = linea.split(",");
				Vial sVial = new Vial();
				sVial.setId(data[0]);
				sVial.setRed(data[1]);
				sVial.setNroRed(data[2]);
				sVial.setCamino(data[3]);
				sVial.setNroCamino(data[4]);
				sListVial.add(sVial);
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sListVial;
	}
}
