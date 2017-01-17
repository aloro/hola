package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;

public class Receta {

	private String titulo;
	private ArrayList<Ingrediente> ingredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;

	public Receta(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Receta(String titulo, ArrayList<Ingrediente> ingredientes, int tiempo, String dificultad, int comensales,
			String descripcion) {
		super();
		this.titulo = titulo;
		setIngredientes(ingredientes);
		this.tiempo = tiempo;
		this.dificultad = dificultad;
		this.comensales = comensales;
		this.descripcion = descripcion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = (ingredientes == null) ? new ArrayList<Ingrediente>() : ingredientes;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static String libreDeGluten(Ingrediente ing) {
		return ing.isGluten() ? " CON GLUTEN " : " LIBRE DE GLUTEN ";
	}

	public boolean isRecetaLibreDeGluten() {
		for (int i = 0; i < this.ingredientes.size(); i++) {
			if (!this.ingredientes.get(i).isGluten()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Comprueba si contiene el {@code ingrediente} pasado como parametro
	 * 
	 * @param ingrediente
	 *            a buscar
	 * @return true si contiene ingrediente <br>
	 *         false en caso contrario
	 */
	public boolean contiene(Ingrediente ingrediente) {
		return false;
	}

	/**
	 * TODO cuando sea null lanzar Exception personalizada <br>
	 * Annadimos un nuevo {@code Ingrediente} a la receta
	 * 
	 * @param ing
	 *            si es null no hace nada
	 */
	public void addIngrediente(Ingrediente ing) {
		if (ing != null) {
			this.ingredientes.add(ing);
		}
	}
	//
	// public boolean removeIngrediente(Ingrediente ing) {
	// return this.ingredientes.remove(ing);
	// }

	public boolean removeIngrediente(Ingrediente ing) {
		boolean resul = false;
		if (ing != null) {

			final String NOMBRE_INGREDIENTE_ELIMINAR = ing.getNombre();
			Ingrediente iterateIngredient = null;
			for (int i = 0; i < this.ingredientes.size(); i++) {
				iterateIngredient = this.ingredientes.get(i);

				if (NOMBRE_INGREDIENTE_ELIMINAR.equalsIgnoreCase(iterateIngredient.getNombre())) {
					this.ingredientes.remove(i);
					resul = true;
					break;
				}
			}
		}
		return resul;
	}

	public static void main(String[] args) {

		Ingrediente ing = null;

		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(new Ingrediente(4, "patata", false));
		ingredientes.add(new Ingrediente(4, "bonitoLimpio", false));
		ingredientes.add(new Ingrediente(4, "cebolleta", false));
		ingredientes.add(new Ingrediente(4, "pimientoVerde", false));
		ingredientes.add(new Ingrediente(4, "pimientoVerde", false));
		ingredientes.add(new Ingrediente(4, "ajo", false));
		ingredientes.add(new Ingrediente(4, "pimientoChoricero", false));
		ingredientes.add(new Ingrediente(4, "panDeSopa", false));
		ingredientes.add(new Ingrediente(4, "agua", true));
		ingredientes.add(new Ingrediente(4, "brandy", false));
		ingredientes.add(new Ingrediente(4, "aceiteOliva", false));
		ingredientes.add(new Ingrediente(4, "sal", false));
		ingredientes.add(new Ingrediente(4, "pimienta", false));
		ingredientes.add(new Ingrediente(4, "guindillaCayena", false));
		ingredientes.add(new Ingrediente(4, "perejil", false));

		Receta marmitako = new Receta("Marmitako", ingredientes, 60, "Normal", 4, "RICO, RICO Y CON FUNDAMENTO");

		System.out.println("LA RECETA DEL MARMITAKO PARA " + marmitako.getComensales() + " PERSONAS");
		for (int i = 0; i < ingredientes.size(); i++) {
			ing = ingredientes.get(i);
			System.out.println("USAR EL INGREDIENTE: " + ing.getNombre());

			System.out.println("USAR EL INGREDIENTE: " + ing.getNombre());

			System.out.println("DURACION DE LA RECETA: " + marmitako.getTiempo());
		}

	}

}
