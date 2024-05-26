package ar.com.unpaz.servicio;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.modelo.*;
import ar.com.unpaz.repositorio.LeerArchivoClienteRepositorio;

public class LeerArchivoClienteServicio {
	public List<Cliente> getListClientes(){
		LeerArchivoClienteRepositorio repo = new LeerArchivoClienteRepositorio();
		List<Cliente> sList = new ArrayList<Cliente>();
		sList = repo.getListClientes();
		return sList;
	}
}
