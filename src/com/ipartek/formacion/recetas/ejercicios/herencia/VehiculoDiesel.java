package com.ipartek.formacion.recetas.ejercicios.herencia;

public class VehiculoDiesel extends Vehiculo {

	public final float MIN_CAPACIDAD_DEPOSITO_COMBUSTIBLE = 45;

	private float capacidadDepositoCombustible;

	public VehiculoDiesel() {
		super();
		this.capacidadDepositoCombustible = MIN_CAPACIDAD_DEPOSITO_COMBUSTIBLE;
	}

	public VehiculoDiesel(String modelo) {
		super(modelo);
		this.capacidadDepositoCombustible = MIN_CAPACIDAD_DEPOSITO_COMBUSTIBLE;
	}

	public float getCapacidadDepositoCombustible() {
		return capacidadDepositoCombustible;
	}

	public void setCapacidadDepositoCombustible(float capacidadDepositoCombustible) {
		this.capacidadDepositoCombustible = capacidadDepositoCombustible;
	}

	@Override
	public String toString() {
		return "VehiculoDiesel [capacidadDepositoCombustible=" + capacidadDepositoCombustible + "] extends "
				+ super.toString();
	}

}
