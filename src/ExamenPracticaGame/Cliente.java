package ExamenPracticaGame;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private String dni;
	private String num_cliente;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNum_cliente() {
		return num_cliente;
	}

	public void setNum_cliente(String num_cliente) {
		this.num_cliente = num_cliente;
	}

	public Cliente(String nombre, String apellido, String direccion, String dni, String num_cliente) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.num_cliente = num_cliente;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", dni=" + dni
				+ ", num_cliente=" + num_cliente + "]";
	}
	

}
