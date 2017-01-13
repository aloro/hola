package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestReceta {

	@Test
	public void testIsRecetaLibreDeGluten() {
		Ingrediente[] ing = new Ingrediente[4];

		// Si todos no tiene gluten
		ing[0] = new Ingrediente(4, "cebolleta", false);
		ing[1] = new Ingrediente(4, "ajo", false);
		ing[2] = new Ingrediente(4, "pimientoVerde", false);
		ing[3] = new Ingrediente(4, "pimientoChoricero", false);
		Receta rct = new Receta(ing);
		assertFalse(rct.isRecetaLibreDeGluten());

		// Si alguno tiene gluten
		ing[0] = new Ingrediente(4, "cebolleta", false);
		ing[1] = new Ingrediente(4, "ajo", true);
		ing[2] = new Ingrediente(4, "pimientoVerde", false);
		ing[3] = new Ingrediente(4, "pimientoChoricero", false);
		rct = new Receta(ing);
		assertFalse(rct.isRecetaLibreDeGluten());

		// Caso null
		rct = new Receta(null);
		assertTrue(rct.isRecetaLibreDeGluten());

	}

}
