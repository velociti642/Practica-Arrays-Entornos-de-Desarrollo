package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMediaNotas {

	@Test
	public void testMediaNotas_valoresValidos() {
	    int[] notas = {8, 9, 10};
	    
	    float mediaEsperada = 9.0f;
	    float mediaObtenida = MisArrays.media(notas);

	    assertEquals(mediaEsperada, mediaObtenida, 0.01f);
	}

	@Test
	public void testMediaNotas_valorInvalido() {
	    int[] notas = {8, 9, 11};

	    float medianaEsperada = 9.0f;
	    float medianaObtenida = MisArrays.media(notas);

	    assertEquals(medianaEsperada, medianaObtenida, 0.01f);
	}
}
