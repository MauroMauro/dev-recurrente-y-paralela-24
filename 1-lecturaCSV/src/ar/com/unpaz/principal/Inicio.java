package ar.com.unpaz.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.model.Vial;
import ar.com.unpaz.servicio.LeerArchivoVialServicio;

public class Inicio {

	public static void main(String[] args) {
		LeerArchivoVialServicio servicio = new LeerArchivoVialServicio();
		
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
	    int opcion;
	    
	    List<Vial> lista = new ArrayList<Vial>();
		lista = servicio.getListViales();
	    
		while (!salir) {
			System.out.println("=======  Lectura CSV Vialidad   =======");
			System.out.println("1- Listar todos los registros");
			System.out.println("2- Actualizar registro");
			System.out.println("3- Borrar registro");
			System.out.println("4- Crear registro");
			System.out.println("9- Salir");

			System.out.println("Escriba una de las opciones");
			opcion = sn.nextInt();
			
			switch(opcion) {
				case 1:
					for (Vial vial : lista) {
						System.out.println(vial.toString());
					}
					break;
					
				case 9:
					System.out.println("Se ha salido del programa");
					salir = true;
					break;
					
				default:
					 System.out.println("Ingrese un valor válido");
					 
			}//fin del switch-case
			
			
		}
		
		

	}

}
