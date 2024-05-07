package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.MisArrays;
import util.MisArrays;

class TestMediaNotas {

	@Test
	public void testMediaNotas_valoresValidos() {
	    int[] notas = {8, 9, 10};
	    
	    float mediaEsperada = 9.0f;
	    float mediaObtenida = MisArrays.mediaNotas(notas);

	    assertEquals(mediaEsperada, mediaObtenida, 0.01f);
	}

	@Test
	public void testMediaNotas_valorInvalido() {
	    int[] notas = {8, 9, 11};

	    try {
	        MisArrays.mediaNotas(notas);
	    } catch (IllegalArgumentException e) {
	        assertEquals("Una de las notas introducidas no se encuentra entre 0 y 10", e.getMessage());
	    }
	}
}
