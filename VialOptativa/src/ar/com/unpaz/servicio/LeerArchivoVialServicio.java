package ar.com.unpaz.servicio;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.crud.Funcionalidades;

public class LeerArchivoVialServicio implements Funcionalidades{
	@Override
	public List<Vial> getListProductos() {
		LeerArchivoDeProductoRepositorio repo = new LeerArchivoDeProductoRepositorio();
		List<Producto> sList = new ArrayList<Producto>();
		sList = repo.getListProductos();
		return sList;
	}
}
