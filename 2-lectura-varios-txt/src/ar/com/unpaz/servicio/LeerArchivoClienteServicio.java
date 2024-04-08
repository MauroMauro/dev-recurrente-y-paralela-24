package ar.com.unpaz.servicio;

import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.repositorio.*;

public class LeerArchivoClienteServicio {
	public List<Cliente> getListClientes(){
		LeerArchivoDeClienteRepositorio repo = new LeerArchivoDeClienteRepositorio();
		List<Cliente> sList = new ArrayList<Cliente>();
		sList = repo.getListClientes();
		return sList;
	}
}
