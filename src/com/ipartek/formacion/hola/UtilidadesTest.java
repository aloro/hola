package com.ipartek.formacion.hola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testGetNumeroAleatorio() {
		int numero = -1;
		final int NUM_MAXIMO = 10;

		// crear array con todo false
		boolean[] aResultado = new boolean[NUM_MAXIMO];

		// generar 1000 numeros aleatorios y actualizar array con true
		for (int i = 0; i < 1000; i++) {
			numero = Utilidades.getNumeroAleatorio(NUM_MAXIMO);
			aResultado[numero] = true;
		}

		// recorrer array y comprobar todo true
		for (int i = 0; i < NUM_MAXIMO; i++) {
			assertTrue(aResultado[i]);
		}
	}

	@Test
	public void testSumaTonta() {

		// int num1 = 0;
		// int num2 = 0;

		assertEquals("NO SUMA CORRECTAMENTE", 5, Utilidades.sumaTonta(2, 3));
		assertEquals(0, Utilidades.sumaTonta(-2, 3));
		assertEquals(0, Utilidades.sumaTonta(-2, -3));
		assertEquals(0, Utilidades.sumaTonta(2, -3));
		assertEquals(0, Utilidades.sumaTonta(1, 100));

		// if ((num1 < 0 || num2 < 0) || ((num1 + num2) > 100)) {
		// assertTrue(Utilidades.sumaTonta(num1, num2) == 0);
		// } else {
		// assertTrue(Utilidades.sumaTonta(num1, num2) == num1 + num2);
		// }
	}

	@Test
	public void testNoFallaNunca() {
		assertTrue(1 < 2);
	}
}
