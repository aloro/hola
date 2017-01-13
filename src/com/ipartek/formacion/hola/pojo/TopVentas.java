package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;

public class TopVentas {

	// Atributes
	private ArrayList<Libro> topVentas = new ArrayList<Libro>();

	// getters and setters
	public ArrayList<Libro> getTopVentas() {
		return topVentas;
	}

	public void setTopVentas(ArrayList<Libro> topVentas) {
		this.topVentas = topVentas;
	}

	public static void main(String[] args) {

		TopVentas tv = new TopVentas();
		tv.getTopVentas().add(new Libro("HARRY POTTER", 850));
		tv.getTopVentas().add(new Libro("COMO DEJAR DE FUMAR", 105));
		tv.getTopVentas().add(new Libro("MEJORE LA RELACION CON SU PAREJA", 123));
		tv.getTopVentas().add(new Libro("JAVA JSE", 1050));
		tv.getTopVentas().add(new Libro("MI ABUELA TENIA UN TRACTOR", 230));

		for (int i = 0; i < tv.getTopVentas().size(); i++) {
			System.out.println(tv.getTopVentas().get(i).toString());
		}

	}

}
