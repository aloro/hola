package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.io.Serializable;

/**
 * Las interfaces nunca pueden tener codigo implementado.<br>
 * Pueden existir interfaces vacias @see Serializable.<br>
 * Soportan herencia multiple, al contrario que las clases.<br>
 * Pueden contener variables, pero seran finales.<br>
 * 
 */
public interface Conducible extends Serializable, Cloneable {

	final String DERECHA = "giro derecha";
	final String IZQUIERDA = "giro izquierda";

	void arrancar();

	void detener();

	void girar(String direccion);

}
