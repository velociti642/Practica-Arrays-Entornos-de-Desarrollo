package model;

import java.util.Arrays;

public class medianaNotas {

	public float medianaNotas(int[] notas) throws IllegalArgumentException {
		for (int nota : notas) {
			if (nota < 0 || nota > 10) {
				throw new IllegalArgumentException("La nota no esta entre 0 y 10");
	        }
	    }

        Arrays.sort(notas);

        int mediana = notas.length / 2;
        if (notas.length % 2 == 0) {
            return (notas[mediana - 1] + notas[mediana]) / 2;
        } else {
            return notas[mediana];
        }
    }
}
