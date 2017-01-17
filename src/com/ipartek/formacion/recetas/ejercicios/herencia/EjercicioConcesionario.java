package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

/**
 * Listar todos los vehiculos del concesionario
 * 
 * @author Curso
 *
 */

public class EjercicioConcesionario {

	public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public static void main(String[] args) {

		// crear vehiculos
		Vehiculo prius = new Vehiculo("Prius");
		prius.setPlazas(5);
		prius.setPotencia(300);

		Vehiculo ibiza = new Vehiculo("Ibiza");
		ibiza.setPlazas(5);
		ibiza.setPotencia(500);

		Vehiculo fordFiesta = new Vehiculo("Ford Fiesta");
		fordFiesta.setPlazas(4);
		fordFiesta.setPotencia(100);

		VehiculoElectrico tesla = new VehiculoElectrico("Tesla");
		tesla.setPlazas(5);
		tesla.setPotencia(100);
		tesla.setCapacidadBaterias(500);

		VehiculoDiesel xsara = new VehiculoDiesel("Citroen Xsara");
		xsara.setPlazas(5);
		xsara.setPotencia(100);
		xsara.setCapacidadDepositoCombustible(95);

		VehiculoDiesel astra = new VehiculoDiesel("Opel Astra");
		astra.setPlazas(5);
		astra.setPotencia(120);
		astra.setCapacidadDepositoCombustible(98);

		// mostrar por pantalla

		vehiculos.add(prius);
		vehiculos.add(ibiza);
		vehiculos.add(fordFiesta);
		vehiculos.add(tesla);
		vehiculos.add(xsara);
		vehiculos.add(astra);

		for (Vehiculo v : vehiculos) {

			System.out.println();
			System.out.println(v.getModelo());
			System.out.println("Plazas: " + v.getPlazas());
			System.out.println("Potencia: " + v.getPotencia());

			if (v instanceof VehiculoElectrico) {
				System.out.println("Capacidad de bateria: " + ((VehiculoElectrico) v).getCapacidadBaterias());
			} else if (v instanceof VehiculoDiesel) {
				System.out.println("Combustible: " + ((VehiculoDiesel) v).getCapacidadDepositoCombustible());
			}

			System.out.println("-------------------------------");

			// System.out.println(v.toString());
		}

	}

}
