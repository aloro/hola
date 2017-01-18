package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.formacion.hola.pojo.Ingrediente;

public class Burro extends Animal implements Conducible, Cocinable, Vendible {

	final private String NOMBRE_DEFAULT = "Astotxo";
	private String nombre;

	public Burro(String raza, float precio) {
		super(raza, precio);
		this.nombre = NOMBRE_DEFAULT;
	}

	public Burro(String raza, float precio, String nombre) {
		super(raza, precio);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void arrancar() {
		System.out.println("Arre burro");
	}

	@Override
	public void detener() {
		System.out.println("Soooooo");
	}

	@Override
	public void girar(String direccion) {
		System.out.println("giro a " + direccion);
	}

	@Override
	public String toString() {
		return "Burro [nombre=" + nombre + "]";
	}

	@Override
	public ArrayList<Ingrediente> getIngredientes() {
		return new ArrayList<Ingrediente>();
	}

	@Override
	public String getDescripcionReceta() {
		return "Salpimentar y a la cazuela";
	}

	@Override
	public void generarFactura() {
		System.out.println("------------------");
		System.out.println("Ud ha adquirido a " + this.nombre);
		System.out.println("un burro de raza " + this.raza);
		System.out.println("por un importe de: " + String.valueOf(this.precio) + " €");
		System.out.println("------------------");
		System.out.println("Tenga un buen dia.");
	}

}
