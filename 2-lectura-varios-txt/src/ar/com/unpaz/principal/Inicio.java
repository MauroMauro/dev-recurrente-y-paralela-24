package ar.com.unpaz.principal;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.model.Producto;
import ar.com.unpaz.servicio.LeerArchivoProductoArchivo;
import ar.com.unpaz.servicio.*;

public class Inicio {
	public static void main(String[] args) {
		LeerArchivoProductoArchivo servicio = new LeerArchivoProductoArchivo();
		LeerArchivoClienteServicio servicioCliente = new LeerArchivoClienteServicio();
		
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		
		List<Producto> lista = new ArrayList<Producto>();
		lista = servicio.getListProductos();
		
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		listaCliente = servicioCliente.getListClientes();
		
		
		while (!salir) {
			System.out.println("=======  Lectura Varios TXT   =======");
			System.out.println("1- Listar todos los productos");
			System.out.println("2- Listar todos los clientes");
			System.out.println("3- Listar todos los detalles");
			System.out.println("4- Listar todos las ventas");
			System.out.println("5- Listar completo");
			System.out.println("9- Salir");

			System.out.println("Escriba una de las opciones");
			opcion = sn.nextInt();
			
			switch(opcion) {
			case 1:
				for (Producto producto : lista) {
					System.out.println(producto.toString());
				}
				break;
			case 2:
				for (Cliente cliente : listaCliente) {
					System.out.println(cliente.toString());
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
