package ar.com.unpaz.procesos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BusquedaDeSubString {
	public void run(String subcadena) {
        List<String> lista = Arrays.asList("jujuy", "salta ", "neuquen", "mendoza", "cordoba", "catamarca", "tucuman", "corrientes", "misiones");

        List<String> palabrasConSubcadena = lista.parallelStream()
                                                     .filter(palabra -> palabra.contains(subcadena))
                                                     .collect(Collectors.toList());

        System.out.println("Palabras que contienen la subcadena \"" + subcadena + "\" ==> " + palabrasConSubcadena);
    
	}
}
