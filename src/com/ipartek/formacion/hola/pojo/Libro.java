package com.ipartek.formacion.hola.pojo;

public class Libro {

	// atributos y constantes
	private String titulo;
	private String autor;
	private int numPaginas;

	/*
	 * Constructores
	 * 
	 * Sirven para instanciar objetos de la Clase <br> Tienen el mismo nombre
	 * que la clase No hace falta especificar el {@code return}
	 * 
	 * sobrecarga: es un metodo con el mismo nombre y mismo return, <br> pero
	 * diferentes parametros
	 * 
	 */

	public Libro() {
		super();
		this.numPaginas = 0;
		this.titulo = "desconocido";
		this.autor = "anonimo";
	}

	public Libro(String string, int i) {
		this.setNumPaginas(i);
		this.titulo = string;
		this.autor = "anonimo";
	}

	// getters y setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = (numPaginas < 0) ? 0 : numPaginas;
	}

	// otros metodos

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + "]";
	}

}
