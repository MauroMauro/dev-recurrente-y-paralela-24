package ar.com.unpaz.servicio;

import java.util.List;
import java.util.ArrayList;
import ar.com.unpaz.model.Producto;
import ar.com.unpaz.repositorio.LeerArchivoDeProductoRepositorio;

public class LeerArchivoProductoArchivo {
	public List<Producto> getListProductos(){
		LeerArchivoDeProductoRepositorio repo = new LeerArchivoDeProductoRepositorio();
		List<Producto> sList = new ArrayList<Producto>();
		sList = repo.getListProductos();
		return sList;
	}
}
