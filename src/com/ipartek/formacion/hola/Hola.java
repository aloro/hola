package com.ipartek.formacion.hola;

import com.ipartek.formacion.hola.pojo.LibroNoEncapsulado;

/**
 * Clase para realiar un 'Hola Mundo'
 * 
 * @author curso
 *
 */
public class Hola {

	/**
	 * metodo 'main' parra ejecutar la clase
	 * 
	 * @param args
	 *            []String
	 */
	public static void main(String[] args) {

		// line comment

		/*
		 * Comentario de bloque Permite más de una linea
		 *
		 * 
		 */

		int a = 0;
		int b = 0;
		a = b++ + 2;
		System.out.println(a);
		System.out.println(b);
		a = 0;
		b = 0;
		a = ++b + 2;
		System.out.println(a);
		System.out.println(b);

		// declarar variables
		int iEntera;
		boolean bBoolena;

		float dineroCuenta = 10.23f; // 10,23 €
		float dineroCuenta2 = (float) 10.23; // 10,23 €

		char caracter = 'p';
		String cadena = "dobles";

		// Operador ternario
		// asignar un valor a una variable en funcion de una condicion
		int edad = (3 > 100) ? 18 : 34;
		System.out.println(String.valueOf(edad));

		System.out.println("Hola Mundo");

		// instanciar un objeto de la clase Libro

		LibroNoEncapsulado libroJava = new LibroNoEncapsulado();
		libroJava.numeroPaginas = 320;
		libroJava.nombre = "Java 7";
		System.out.println(libroJava.describete());

		LibroNoEncapsulado libroHtml = new LibroNoEncapsulado();
		libroHtml.numeroPaginas = 773;
		libroHtml.nombre = "HTML y PHP";
		libroHtml.autor = "Roberto Montero";
		System.out.println(libroHtml.describete());

		// escribir 10 paginas
		libroHtml.escribir(10);

		System.out.println(libroHtml.describete());

	}
}
