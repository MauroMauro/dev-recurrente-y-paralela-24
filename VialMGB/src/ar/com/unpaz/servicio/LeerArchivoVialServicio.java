package ar.com.unpaz.servicio;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.crud.Funcionalidades;
import ar.com.unpaz.model.Vial;
import ar.com.unpaz.repositorio.LeerArchivoVialRepositorio;

public class LeerArchivoVialServicio implements Funcionalidades{
	@Override
	public List<Vial> getListViales(){
		LeerArchivoVialRepositorio repo = new LeerArchivoVialRepositorio();
		List<Vial> sList = new ArrayList<Vial>();
		sList = repo.getListViales();
		return sList;
	}
}
