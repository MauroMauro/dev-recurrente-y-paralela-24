package ar.com.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.crud.Funcionalidades;
import ar.com.unpaz.model.Producto;

public class LeerArchivoDeProductoRepositorio implements Funcionalidades{
	public List<Producto> getListProductos(){
		//File sFile = new File("C:\\Users\\AULA-211-0\\Desktop\\prog-recu-paral-24\\2-lectura-varios-txt\\archivos\\Producto.txt");
		File sFile = new File("archivos/Producto.txt");
		List<Producto> sListProducto = new ArrayList<Producto>();
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBufferReader = new BufferedReader(sFileReader);
			String linea = "";
			while((linea = sBufferReader.readLine()) != null) {
				String data [] = linea.split(",");
				Producto sProducto =new Producto();
				sProducto.setId(data[0]);
				sProducto.setNombre(data[1]);
				sProducto.setCantidad(data[2]);
				sProducto.setPrecio(data[3]);
				sListProducto.add(sProducto);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		return sListProducto;
	}
}
