package ar.com.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.crud.FuncionalidadesVenta;
import ar.com.unpaz.model.Venta;

public class LeerArchivoDeVentaRepositorio implements FuncionalidadesVenta{
	public List<Venta> getListVenta(){
		File sFile = new File("C:\\Users\\AULA-211-0\\Desktop\\prog-recu-paral-24\\2-lectura-varios-txt\\archivos\\Venta.txt");
//		File sFile = new File("/archivos/Venta.txt");
		List<Venta> sListVenta = new ArrayList<Venta>();
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBufferReader = new BufferedReader(sFileReader);
			String linea = "";
			while((linea = sBufferReader.readLine()) != null) {
				String data [] = linea.split(",");
				Venta sVenta = new Venta();
				sVenta.setId(data[0]);
				sVenta.setFecha(data[1]);
				sVenta.setIdCliente(data[2]);
				sVenta.setTotal(data[3]);
				sListVenta.add(sVenta);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		return sListVenta;
	}
}
