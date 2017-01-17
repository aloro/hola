package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestReceta {

	// variables globales, se inicializan en "setUp"
	public Receta tortillaPatatas;
	public Ingrediente huevos = new Ingrediente(12, "huevo", true);
	public Ingrediente cebolla = new Ingrediente(1, "cebolla", true);
	public Ingrediente patatas = new Ingrediente(4, "patata", true);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tortillaPatatas = new Receta(null);
		tortillaPatatas.addIngrediente(huevos);
		tortillaPatatas.addIngrediente(cebolla);
		tortillaPatatas.addIngrediente(patatas);
	}

	@After
	public void tearDown() throws Exception {
		tortillaPatatas = null;
	}

	@Test
	public void testAddIngrediente() {
		Receta r = new Receta(null);
		r.addIngrediente(null);
		int numero = r.getIngredientes().size();
		assertEquals("No deben existir ingredientes", 0, numero);

		r.addIngrediente(null);
		numero = r.getIngredientes().size();
		assertEquals("No deben existir ingredientes", 0, numero);

		r.addIngrediente(new Ingrediente(0, "", true));
		numero = r.getIngredientes().size();
		assertEquals(1, numero);

	}

	@Test
	public void testRemoveIngrediente() {
		Receta r = new Receta(null);
		assertFalse(r.removeIngrediente(null));

		tortillaPatatas.addIngrediente(huevos);
		huevos.setNombre("HueVos");
		tortillaPatatas.removeIngrediente(huevos);

		ArrayList<Ingrediente> ingredientes = tortillaPatatas.getIngredientes();
		assertEquals(3, tortillaPatatas.getIngredientes().size());

		// TODO comprobar que sean huevo, cebolla y patatas
		assertFalse(tortillaPatatas.contiene(null));
		assertFalse(tortillaPatatas.contiene(new Ingrediente(2, "Salmonela", true)));
		assertTrue(tortillaPatatas.contiene(huevos));
		assertTrue(tortillaPatatas.contiene(cebolla));
		assertTrue(tortillaPatatas.contiene(patatas));

	}

	@Test
	public void testConstructor() {
		Receta r = new Receta(null);
		assertNotNull("Deberia estar inicializado a new", r.getIngredientes());
	}

	@Test
	public void testIsRecetaLibreDeGluten() {
		ArrayList<Ingrediente> ing = new ArrayList<Ingrediente>();

		// Si todos no tiene gluten
		ing.add(new Ingrediente(4, "cebolleta", false));
		ing.add(new Ingrediente(4, "ajo", false));
		ing.add(new Ingrediente(4, "pimientoVerde", false));
		ing.add(new Ingrediente(4, "pimientoChoricero", false));

		Receta rct = new Receta(ing);
		assertFalse(rct.isRecetaLibreDeGluten());

		// Si alguno tiene gluten
		ing.clear();
		ing.add(new Ingrediente(4, "cebolleta", false));
		ing.add(new Ingrediente(4, "ajo", true));
		ing.add(new Ingrediente(4, "pimientoVerde", false));
		ing.add(new Ingrediente(4, "pimientoChoricero", false));
		rct = new Receta(ing);
		assertFalse(rct.isRecetaLibreDeGluten());

		// Caso null
		rct = new Receta(null);
		assertTrue(rct.isRecetaLibreDeGluten());

	}

}
