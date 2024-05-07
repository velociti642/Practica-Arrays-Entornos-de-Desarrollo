package model;

public class maximaNota {

	public float maximaNota(int[] notas) throws IllegalArgumentException {
		for (int nota : notas) {
			if (nota < 0 || nota > 10) {
				throw new IllegalArgumentException("La nota no esta entre 0 y 10");
	        }
	    }

		int maxNota = notas[0];
        for (int nota : notas) {
            if (nota > maxNota) {
                maxNota = nota;
            }
        }

        return maxNota;
    }
}
