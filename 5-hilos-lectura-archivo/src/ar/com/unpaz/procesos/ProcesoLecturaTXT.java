package ar.com.unpaz.procesos;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.modelo.Cliente;
import ar.com.unpaz.servicio.LeerArchivoClienteServicio;

public class ProcesoLecturaTXT extends Thread{
	
	
	public void run () {
		System.out.println("Corriendo ProcesoLecturaTXT");
		LeerArchivoClienteServicio servicioCliente = new LeerArchivoClienteServicio();
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		listaCliente = servicioCliente.getListClientes();
		
		for (Cliente cliente : listaCliente) {
			System.out.println(cliente.toString());
		}
	}
}
