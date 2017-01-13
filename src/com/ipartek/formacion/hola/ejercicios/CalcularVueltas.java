package com.ipartek.formacion.hola.ejercicios;

public class CalcularVueltas {

	public static void main(String[] args) {

		float compra = 1326.24f;
		float pago = 4 * 500;

		float vueltas = pago - compra;
		float resto = vueltas;

		// ARRAY CON EL VALOR DE CADA BILLETE Y MONEDA
		final float[] DINERO = { 50f, 20f, 10f, 5f, 2f, 1f, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f };

		// ARRAY DE LITERALES
		final String[] LITERALES = { "BILLETE 50€", "BILLETE 20€", "BILLETE 10€", "BILLETE 5€", "MONEDA 2€",
				"MONEDA 1€", "MONEDA 50 CENTIMOS €", "MONEDA 20 CENTIMOS €", "MONEDA 10 CENTIMOS €",
				"MONEDA 5 CENTIMOS €", "MONEDA 2 CENTIMOS €", "BILLETE 1 CENTIMOS€" };

		// ARRAY CON LAS VUELTAS
		int[] aVueltas = new int[DINERO.length];

		for (int i = 0; i < aVueltas.length; i++) {
			aVueltas[i] = (int) (resto / DINERO[i]);
			resto = resto % DINERO[i];
		}

		for (int i = 0; i < aVueltas.length; i++) {
			System.out.println(aVueltas[i]);
		}

		System.out.println("--------------------");
		System.out.println("------ TICKET ------");
		System.out.println("--------------------");
		System.out.println("PAGO: " + compra);
		System.out.println("RETORNO: " + vueltas + "€");
		System.out.println("--------------------");
		System.out.println("LAS VUELTAS: ");
		System.out.println("--------------------");
		System.out.println("- GRACIAS POR SU VISITA -");
		System.out.println("--------------------");

	}

}
