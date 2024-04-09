package ar.com.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.crud.FuncionalidadesDetalle;
import ar.com.unpaz.model.Detalle;



public class LeerArchivoDeDetalleRepositorio implements FuncionalidadesDetalle{
	public List<Detalle> getListDetalle(){
		//File sFile = new File("C:\\Users\\AULA-211-0\\Desktop\\prog-recu-paral-24\\2-lectura-varios-txt\\archivos\\Cliente.txt");
		File sFile = new File("archivos/Detalle.txt");
		List<Detalle> sListDetalle = new ArrayList<Detalle>();
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBufferReader = new BufferedReader(sFileReader);
			String linea = "";
			while((linea = sBufferReader.readLine()) != null) {
				String data [] = linea.split(",");
				Detalle sDetalle =new Detalle();
				sDetalle.setId(data[0]);
				sDetalle.setIdVenta(data[1]);
				sDetalle.setIdProducto(data[2]);
				sDetalle.setCantidad(Integer.parseInt(data[3]));
				sDetalle.setPrecio(Integer.parseInt(data[4]));
				sListDetalle.add(sDetalle);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		return sListDetalle;
	}


}

