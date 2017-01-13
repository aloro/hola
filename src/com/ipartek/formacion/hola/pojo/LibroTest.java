package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibroTest {

	@Test
	public void testConstructorPorDefecto() {
		Libro l = new Libro();

		assertEquals("desconocido", l.getTitulo());
		assertEquals("anonimo", l.getAutor());
		assertEquals(0, l.getNumPaginas());
	}

	@Test
	public void testConstructorConParametros() {

		Libro l = new Libro("java 7", 324);
		assertEquals("java 7", l.getTitulo());
		assertEquals("anonimo", l.getAutor());
		assertEquals(324, l.getNumPaginas());

		// paginas negativas
		l = new Libro("java 7", -1);
		assertEquals("java 7", l.getTitulo());
		assertEquals("anonimo", l.getAutor());
		assertEquals(0, l.getNumPaginas());

	}

	@Test
	public void testTitulo() {

		Libro libroJava = new Libro();
		// libroJava.titulo = "java 7";
		libroJava.setTitulo("java 7");
		assertEquals("java 7", libroJava.getTitulo());
	}

	@Test
	public void testNumeroPaginas() {

		Libro l = new Libro();

		// numero paginas positivo
		l.setNumPaginas(300);
		assertEquals(300, l.getNumPaginas());

		// numero paginas negativo == 0
		l.setNumPaginas(-300);
		assertEquals("SI EL # DE PGS ES NEGATIVO, DEBE DEVOLVER 0 ", 0, l.getNumPaginas());

	}

}
