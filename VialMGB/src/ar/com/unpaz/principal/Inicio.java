package ar.com.unpaz.principal;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Vial;
import ar.com.unpaz.servicio.LeerArchivoVialServicio;

public class Inicio {
	public static void main (String [] args) {
		LeerArchivoVialServicio servicio = new LeerArchivoVialServicio();
		System.out.print("***************************");
		System.out.print("    Programa de lectura");
		System.out.print("***************************");
		
		List<Vial> lista = new ArrayList<Vial>();
		lista = servicio.getListViales();
		
		for (Vial vial : lista) {
			vial.toString();
		}
	}
}
