package ExamenPracticaGame;

import java.util.Arrays;

public class Videojuego {
	private String nombre;
	private String categoria;
	private Personaje[] personajes;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Personaje[] getPersonajes() {
		return personajes;
	}

	public void setPersonajes(Personaje[] personajes) {
		this.personajes = personajes;
	}

	public Videojuego(String nombre, String categoria, Personaje[] personajes) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.personajes = personajes;
	}

	public Videojuego() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", categoria=" + categoria + ", personajes="
				+ Arrays.toString(personajes) + "]";
	}
	

}
