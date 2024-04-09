package ar.com.unpaz.principal;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DTO.InformeDTO;
import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.model.Detalle;
import ar.com.unpaz.model.Informe;
import ar.com.unpaz.model.Producto;
import ar.com.unpaz.model.Venta;
import ar.com.unpaz.servicio.LeerArchivoProductoArchivo;
import ar.com.unpaz.servicio.*;

public class Inicio {
	public static void main(String[] args) {
		LeerArchivoProductoArchivo servicio = new LeerArchivoProductoArchivo();
		LeerArchivoClienteServicio servicioCliente = new LeerArchivoClienteServicio();
		LeerArchivoVentaServicio servicioVenta = new LeerArchivoVentaServicio();
		LeerArchivoDetalleServicio servicioDetalle = new LeerArchivoDetalleServicio();
		
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		
		List<Producto> lista = new ArrayList<Producto>();
		lista = servicio.getListProductos();
		
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		listaCliente = servicioCliente.getListClientes();
		
		List<Venta> listaVenta = new ArrayList<Venta>();
		listaVenta = servicioVenta.getListVentas();
		
		List<Detalle> listaDetalle = new ArrayList<Detalle>();
		listaDetalle = servicioDetalle.getListDetalles();
		
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
			
			case 3:
				for (Detalle detalle : listaDetalle) {
					System.out.println(detalle.toString());
				}
				break;
			
			case 4:
				for (Venta venta: listaVenta) {
					System.out.println(venta.toString());
				}
				break;
			case 5:
				InformeDTO informeDTO = new InformeDTO();
				for (Informe informe: informeDTO.generarListaInformes()) {
					System.out.println(informe.toString());
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
