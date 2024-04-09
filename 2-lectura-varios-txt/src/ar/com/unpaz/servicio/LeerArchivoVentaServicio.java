package ar.com.unpaz.servicio;

import java.util.List;
import java.util.ArrayList;

import ar.com.unpaz.model.Venta;
import ar.com.unpaz.repositorio.LeerArchivoDeVentaRepositorio;

public class LeerArchivoVentaServicio {
	public List<Venta> getListVentas(){
		LeerArchivoDeVentaRepositorio repo = new LeerArchivoDeVentaRepositorio();
		List<Venta> sList = new ArrayList<Venta>();
		sList = repo.getListVenta();
		return sList;
	}
}
