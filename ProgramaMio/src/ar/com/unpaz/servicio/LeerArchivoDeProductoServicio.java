package ar.com.unpaz.servicio;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.crud.Funcionalidades;
import ar.com.unpaz.model.Producto;
import ar.com.unpaz.repositorio.LeerArchivoDeProductoRepositorio;

/**
 * 
 * @author AULA-106
 *
 */
public class LeerArchivoDeProductoServicio implements Funcionalidades {

	@Override
	public List<Producto> getListProductos() {
		LeerArchivoDeProductoRepositorio repo = new LeerArchivoDeProductoRepositorio();
		List<Producto> sList = new ArrayList<Producto>();
		sList = repo.getListProductos();
		return sList;
	}

}
