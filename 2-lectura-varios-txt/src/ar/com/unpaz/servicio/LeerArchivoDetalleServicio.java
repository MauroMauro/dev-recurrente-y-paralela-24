package ar.com.unpaz.servicio;

import java.util.List;
import java.util.ArrayList;

import ar.com.unpaz.model.Detalle;
import ar.com.unpaz.repositorio.LeerArchivoDeDetalleRepositorio;

public class LeerArchivoDetalleServicio {
	public List<Detalle> getListDetalles(){
		LeerArchivoDeDetalleRepositorio repo = new LeerArchivoDeDetalleRepositorio();
		List<Detalle> sList = new ArrayList<Detalle>();
		sList = repo.getListDetalle();
		return sList;
	}
}