package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMediana {
	
	@Test
	public void testMedianaNotas_valoresValidos() {
	    int[] notas = {8, 9, 10};
	    
	    float medianaEsperada = 9.0f;
	    float medianaObtenida = MisArrays.mediana(notas);

	    assertEquals(medianaEsperada, medianaObtenida, 0.01f);
	}

	@Test
	public void testMedianaNotas_valorInvalido() {
	    int[] notas = {8, 9, 11};

	    float medianaEsperada = 9.0f;
	    float medianaObtenida = MisArrays.mediana(notas);

	    assertEquals(medianaEsperada, medianaObtenida, 0.01f);
	}
}
