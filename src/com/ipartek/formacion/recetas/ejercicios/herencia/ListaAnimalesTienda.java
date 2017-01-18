package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

/**
 * 
 * Ejercicio para aprender a usar la herencia en interfaces.<br>
 * Capitulo 8 del libro Java 7.<br>
 * 
 * @author Curso
 *
 */

public class ListaAnimalesTienda {

	public static void main(String[] args) {

		ArrayList<Vendible> listaAnimales = new ArrayList<Vendible>();

		Burro astotxo = new Burro("Majorero", 2000f);
		Burro igor = new Burro("Cordobesa", 300f, "Igor");
		Pajaro canario = new Pajaro("Canario", 30f);
		Pajaro kiwi = new Pajaro("Neozelandesa", 150f, "Genaro", false);

		listaAnimales.add(astotxo);
		listaAnimales.add(igor);
		listaAnimales.add(canario);
		listaAnimales.add(kiwi);

		for (Vendible v : listaAnimales) {
			if (v instanceof Burro) {
				((Burro) v).generarFactura();
			} else if (v instanceof Pajaro) {
				((Pajaro) v).generarFactura();

				/*
				 * Tambien se puede preguntar por Interfaces
				 * if (p instanceof Volador){
				 * 
				 * }
				 * 
				 */

			} else {
				System.out.println("**** No se sabe qué es " + v.toString());
			}
		}

	}

}
