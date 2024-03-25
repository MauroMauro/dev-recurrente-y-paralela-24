package ar.com.unpaz.principal;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Producto;
import ar.com.unpaz.servicio.LeerArchivoDeProductoServicio;

public class Inicio {

	public static void main(String[] args) {
		LeerArchivoDeProductoServicio  servicio = new LeerArchivoDeProductoServicio();
		System.out.print("***************************");
		System.out.print("    Programa de lectura");
		System.out.print("***************************");
		
		List<Producto> lista = new ArrayList<Producto>();
		lista= servicio.getListProductos();
		
		for (Producto producto : lista) {
				System.out.println("Nombre " +  producto.getNombre() + " Desripcion "  + producto.getDescripcion() +" Cantidad " + producto.getCantidad() + " precio " + producto.getPrecio()  );
		}


	}

}
