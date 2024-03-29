package ar.com.unpaz.servicio;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Vial;
import ar.com.unpaz.repositorio.LeerArchivoDeProductoRepositorio;

public class LeerArchivoVialServicio {
	public List<Vial> getListViales() {
		LeerArchivoDeProductoRepositorio repo = new LeerArchivoDeProductoRepositorio();
		List<Vial> sList = new ArrayList<Vial>();
		sList = repo.getListViales();
		return sList;
	}
}
