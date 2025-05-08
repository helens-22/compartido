package ExamenPracticaGame;

public class Personaje {
	private String nombre;
	private String tipo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Personaje(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public Personaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	

}
