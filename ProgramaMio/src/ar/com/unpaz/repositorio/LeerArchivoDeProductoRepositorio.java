package ar.com.unpaz.repositorio;
import  java.io.*;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.crud.Funcionalidades;
import ar.com.unpaz.model.Producto;

public class LeerArchivoDeProductoRepositorio implements Funcionalidades {

	@Override
	public List<Producto> getListProductos() {
		File sFile = new File("D:\\archivos\\productos.txt");
		List<Producto> sListProducto = new ArrayList<Producto>();
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBufferReader = new BufferedReader(sFileReader);
			String linea = "";
			while((linea = sBufferReader.readLine()) != null) {
				   String data [] = linea.split(",");
				   Producto  sProducto = new Producto();
				   sProducto.nombre = data[0];
				   sProducto.descripcion = data[1];
				   sProducto.cantidad = data[2];
				   sProducto.precio = data[3];
				   sListProducto.add(sProducto);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sListProducto;
	}

}
