package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestReceta {

	@Test
	public void testIsRecetaLibreDeGluten() {
		Ingrediente[] ing = new Ingrediente[4];
		ing[0] = new Ingrediente(4, "cebolleta", false);
		ing[1] = new Ingrediente(4, "ajo", false);
		ing[2] = new Ingrediente(4, "pimientoVerde", false);
		ing[3] = new Ingrediente(4, "pimientoChoricero", false);
		Receta rct = new Receta(ing);
		assertTrue(!rct.isRecetaLibreDeGluten());
	}

}
