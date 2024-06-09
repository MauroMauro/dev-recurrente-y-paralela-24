package ar.com.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.modelo.Cliente;

public class LeerArchivoClienteRepositorio {
	public List<Cliente> getListClientes(){
		//File sFile = new File("C:\\Users\\AULA-211-0\\Desktop\\prog-recu-paral-24\\2-lectura-varios-txt\\archivos\\Cliente.txt");
		File sFile = new File("archivos/Cliente.txt");
		List<Cliente> sListCliente = new ArrayList<Cliente>(); 
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBufferReader = new BufferedReader(sFileReader);
			String linea = "";
			while((linea = sBufferReader.readLine()) != null) {
				String data [] = linea.split(",");
				Cliente sCliente =new Cliente();
				sCliente.setId(data[0]);
				sCliente.setNombre(data[1]);
				sCliente.setApellido(data[2]);
				sCliente.setTelefono(data[3]);
				sListCliente.add(sCliente);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		return sListCliente;
	}

}
