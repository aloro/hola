package com.ipartek.formacion.recetas.ejercicios.herencia;

public class Pajaro extends Animal implements Vendible, Volador {

	final private String NOMBRE_DEFAULT = "Piolin";
	final private boolean VOLAR_DEFAULT = true;

	private String nombre;
	private boolean volar;

	public Pajaro(String raza, float precio) {
		super(raza, precio);
		this.nombre = NOMBRE_DEFAULT;
		this.volar = VOLAR_DEFAULT;
	}

	public Pajaro(String raza, float precio, String nombre, boolean volar) {
		super(raza, precio);
		this.nombre = nombre;
		this.volar = volar;
	}

	public boolean puedeVolar() {
		return this.volar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void despegar() {
		System.out.println("Allá vamooooossss ...");
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterrizando en 3, 2, 1, ...");
	}

	private String esVolador() {
		return this.puedeVolar() ? "SÍ" : "NO";
	}

	@Override
	public void generarFactura() {
		System.out.println("------------------");
		System.out.println("Ud ha adquirido a " + this.nombre);
		System.out.println("un pájaro de raza " + this.raza);
		System.out.println("que " + esVolador() + " puede volar");
		System.out.println("por un importe de: " + String.valueOf(this.precio) + " €");
		System.out.println("------------------");
		System.out.println("Tenga un buen dia.");
	}

}
