package com.ipartek.formacion.hola;

public class Dado {

	static String[] aAlumnos = { "Aaron", "Eneko", "Itsaso", "Ivan", "Guillermo", "Lozoya", "Josu", "Ignacio", "Gomez",
			"Nerea", "Nagore", "Garbiñe", "Egoitz", "Pavel", "Perez" };

	public static void main(String[] args) {

		// TODO buscar como generar un numero aleatorio rangon [0-14]
		// int numeroAleatorio = (int) (Math.random() * (aAlumnos.length + 1));

		int numeroAleatorio = Utilidades.getNumeroAleatorio(aAlumnos.length - 1);
		String afortunado = aAlumnos[numeroAleatorio];

		System.out.println("El/a afortunad@ es: " + afortunado);

	}
}
