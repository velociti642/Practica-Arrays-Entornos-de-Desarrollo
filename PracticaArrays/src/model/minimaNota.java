package model;

public class minimaNota {

	public float minima(int[] notas) throws IllegalArgumentException {
		for (int nota : notas) {
			if (nota < 0 || nota > 10) {
				throw new IllegalArgumentException("La nota no esta entre 0 y 10");
	        }
	    }

		int minNota = notas[0];
        for (int nota : notas) {
            if (nota > minNota) {
                minNota = nota;
            }
        }

        return minNota;
    }
}
