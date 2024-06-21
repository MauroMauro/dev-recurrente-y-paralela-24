package ar.com.unpaz.procesos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaAleatoria {
	public List<Integer> generarLista(){
		
		List<Integer> lista = new ArrayList<>();
		Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(50) + 1; // Genera un número entre 1 y 50
            lista.add(randomNumber);
        }	
		
		
		return lista;
	}
}
