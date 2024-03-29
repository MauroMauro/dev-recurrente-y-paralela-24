package ar.com.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.crud.Funcionalidades;
import ar.com.unpaz.model.Vial;

public class LeerArchivoDeProductoRepositorio implements Funcionalidades {
	@Override
	public List<Vial> getListViales() {
		File sFile = new File("/archivo/vial.csv");
		List<Vial> sListVial = new ArrayList<Vial>();
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBufferReader = new BufferedReader(sFileReader);
			String linea = "";
			while((linea = sBufferReader.readLine()) != null) {
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
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		
		return sListVial;
	}
}
