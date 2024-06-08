package ar.com.unpaz.procesos;

public class EsPrimo {
	public static boolean run(int numero) {
		if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
	}
}
