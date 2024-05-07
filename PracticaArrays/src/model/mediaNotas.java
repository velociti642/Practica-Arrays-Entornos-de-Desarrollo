package model;

public class mediaNotas {

	public float mediaNotas(int[] notas) throws IllegalArgumentException {
		for (int nota : notas) {
			if (nota < 0 || nota > 10) {
				throw new IllegalArgumentException("La nota no esta entre 0 y 10");
	        }
	    }

	    float suma = 0;
	    for (int nota : notas) {
	    	suma += nota;
	    }
	    return suma / notas.length;
	    }
}
