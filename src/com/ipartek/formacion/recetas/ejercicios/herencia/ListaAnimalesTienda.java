package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

public class ListaAnimalesTienda {

	public static ArrayList<Vendible> listaAnimales = new ArrayList<Vendible>();

	public static void main(String[] args) {

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
			} else {
				((Pajaro) v).generarFactura();
			}
		}

	}

}
