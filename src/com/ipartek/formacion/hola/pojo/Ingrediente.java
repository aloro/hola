package com.ipartek.formacion.hola.pojo;

public class Ingrediente {

	private float cantidad;
	private String nombre;
	private boolean gluten;

	public Ingrediente(float _cantidad, String _nombre, boolean _gluten) {
		this.cantidad = _cantidad;
		this.nombre = _nombre;
		this.gluten = _gluten;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

}
