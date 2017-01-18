package com.ipartek.formacion.recetas.ejercicios.herencia;

/**
 * Clase abstract porque tiene un metodo abstract "dibujar".<br>
 * No se puede instanciar al igual que las interfaces.<br>
 * Este metodo sera implementado por sus clases hijas, o puede que no.<br>
 * Si una clase hija no implementa el metodo "abstract", debe ser una clase
 * "abstract".<br>
 * 
 * @author Curso
 *
 */

public abstract class ObjetoGrafico {

	private int x;
	private int y;

	/**
	 * Se compone de una latitud y longitud, mediante una clase interna.
	 */

	private GeoPunto gp;

	// Clase interna
	class GeoPunto {
		public float latitud;
		public float longitud;
	}

	public ObjetoGrafico(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	void mover(int x, int y) {
		System.out.println("Objeto movido a nueva posicion " + "x" + " " + y);
	}

	public abstract void dibujar();
}
