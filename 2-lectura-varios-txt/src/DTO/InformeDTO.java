package DTO;

import java.util.ArrayList;
import java.util.List;
import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.model.Informe;
import ar.com.unpaz.model.Venta;
import ar.com.unpaz.servicio.LeerArchivoClienteServicio;
import ar.com.unpaz.servicio.LeerArchivoVentaServicio;

public class InformeDTO {
	
	public List<Informe> generarListaInformes() {
		LeerArchivoClienteServicio servicioCliente = new LeerArchivoClienteServicio();
		LeerArchivoVentaServicio servicioVenta = new LeerArchivoVentaServicio();
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		listaCliente = servicioCliente.getListClientes();
		
		List<Venta> listaVenta = new ArrayList<Venta>();
		listaVenta = servicioVenta.getListVentas();
		
		int cantidadDeVentasCliente = 0;
		int totalDeVentasCliente = 0;
		
		List<Informe> listaInforme = new ArrayList<Informe>();
		
		for (Cliente cliente : listaCliente) {
			for(Venta venta : listaVenta) {
				if(venta.getIdCliente().equals(cliente.getId()) ) {
					cantidadDeVentasCliente ++;
					totalDeVentasCliente += Integer.parseInt(venta.getTotal());
				}
			}
			Informe informe = new Informe(Integer.toString(listaInforme.size()+1),cliente.getId(),cantidadDeVentasCliente, totalDeVentasCliente);
			listaInforme.add(informe);
			cantidadDeVentasCliente = 0;
			totalDeVentasCliente = 0;
		}
		
		
		return listaInforme;
	}
	
}

