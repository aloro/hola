package com.ipartek.formacion.hola.pojo;

public class Receta {

	private String titulo;
	private Ingrediente[] ingredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;

	public Receta(Ingrediente[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Receta(String titulo, Ingrediente[] ingredientes, int tiempo, String dificultad, int comensales,
			String descripcion) {
		super();
		this.titulo = titulo;
		this.ingredientes = ingredientes;
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

	public Ingrediente[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingrediente[] ingredientes) {
		this.ingredientes = ingredientes;
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
		for (int i = 0; i < this.ingredientes.length; i++) {
			if (!this.ingredientes[i].isGluten()) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Ingrediente ing = null;

		Ingrediente[] ingredientes = { new Ingrediente(4, "patata", false), new Ingrediente(4, "bonitoLimpio", false),
				new Ingrediente(4, "cebolleta", false), new Ingrediente(4, "pimientoVerde", false),
				new Ingrediente(4, "ajo", false), new Ingrediente(4, "pimientoChoricero", false),
				new Ingrediente(4, "panDeSopa", false), new Ingrediente(4, "agua", true),
				new Ingrediente(4, "brandy", false), new Ingrediente(4, "aceiteOliva", false),
				new Ingrediente(4, "sal", false), new Ingrediente(4, "pimienta", false),
				new Ingrediente(4, "guindillaCayena", false), new Ingrediente(4, "perejil", false) };

		Receta marmitako = new Receta("Marmitako", ingredientes, 60, "Normal", 4, "RICO, RICO Y CON FUNDAMENTO");

		System.out.println("LA RECETA DEL MARMITAKO PARA " + marmitako.getComensales() + " PERSONAS");
		for (int i = 0; i < ingredientes.length; i++) {
			ing = ingredientes[i];
			System.out.println("USAR EL INGREDIENTE: " + ing.getNombre());

			System.out.println("USAR EL INGREDIENTE: " + ing.getNombre());

			System.out.println("DURACION DE LA RECETA: " + marmitako.getTiempo());
		}

	}

}
