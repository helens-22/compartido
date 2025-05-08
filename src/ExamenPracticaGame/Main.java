package ExamenPracticaGame;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

	}
	/*
	 * Ejercicio 2: Crea los típicos métodos ExisteVideojuego, ExisteCliente y
	 * ExisteEmpleado para que devuelvan true o false si la entidad buscada existe o
	 * no. Los métodos recibirán un arrayList de Videojuegos y un objeto Videojuego
	 * a buscar (ExisteVideojuego), un arrayList de clientes y un objeto cliente a
	 * buscar (ExisteCliente) y un arrayList de empleados y un objeto empleado a
	 * buscar (ExisteEmpleado). Utiliza los campos clave para realizar las
	 * búsquedas.
	 */

	public static boolean existeVideojuego(ArrayList<Videojuego> videojuegos, Videojuego videojuego) {
		var existe = false;
		for (Videojuego videojuego1 : videojuegos) {
			if (videojuego1.getNombre().equalsIgnoreCase(videojuego.getNombre())) {
				existe = true;
			}
		}
		return existe;
	}

	public static boolean existeCliente(ArrayList<Cliente> clientes, Cliente cliente) {
		var existe = false;
		for (Cliente cliente1 : clientes) {
			if (cliente1.getDni().equalsIgnoreCase(cliente.getDni())) {
				existe = true;
			}
		}
		return existe;
	}

	// overload: metodos que se llaman igual pero reciben distintos parámetros (como
	// el de arriba)
	public static boolean existeCliente(ArrayList<Cliente> clientes, String dni) {
		var existe = false;
		for (Cliente cliente1 : clientes) {
			if (cliente1.getDni().equalsIgnoreCase(dni)) {
				existe = true;
			}
		}
		return existe;
	}

	public static boolean existeEmpleado(ArrayList<Empleado> empleados, Empleado empleado) {
		var existe = false;
		for (Empleado empleado1 : empleados) {
			if (empleado1.getDni().equalsIgnoreCase(empleado.getDni())) {
				existe = true;
			}
		}
		return existe;
	}

	/*
	 * Ejercicio 3: Realiza un método que devuelva el importe total de todas las
	 * ventas que se le han hecho a un cliente. El método recibirá por parámetro un
	 * arrayList de ventas que contiene todas las ventas hechas en todas las tiendas
	 * y un objeto Cliente.
	 */

	public static double importeTotalCliente(ArrayList<Venta> ventas, Cliente cliente) {
		var importeTotal = 0.0;
		for (Venta venta : ventas) {
			if (venta.getCliente().getDni().equalsIgnoreCase(cliente.getDni())) {
				importeTotal += venta.importeTotal();
			}
		}
		return importeTotal;
	}

	/*
	 * Ejercicio 4: Realiza un método que devuelva los nombres de todos los
	 * videojuegos vendidos en una tienda en concreto por un importe mayor a 70€,
	 * ten en cuenta que en una venta puede haber muchos videojuegos vendidos,
	 * algunos superarán los 70€ y otros no. El método recibirá por parámetro un
	 * arraylist de ventas con todas las ventas hechas en todas las tiendas y la
	 * tienda en concreto.
	 */

	public static ArrayList<String> nomVideojuegoMas70EnTienda(ArrayList<Venta> ventas, Tienda tienda) {
		var nombres = new ArrayList<String>();
		for (Venta venta : ventas) {
			// esto busca la tienda en concreto
			if (tienda.getNum_tienda().equalsIgnoreCase(venta.getTienda().getNum_tienda())) {
				for (String n : nombresVideojuegosmas70(venta)) {
					nombres.add(n);
				}
			}
		}
		return nombres;
	}

	// metodo para buscar el videojuego que cuesta más de 70 euros
	public static ArrayList<String> nombresVideojuegosmas70(Venta venta) {
		var nombres = new ArrayList<String>();
		for (Linea_venta linea : venta.getLineas_venta()) {
			if (linea.getImporte() > 70) {
				// con el add almacenamos en el ArrayList los nombres de esos videojuegos
				nombres.add(linea.getVideojuego().getNombre());
			}
		}
		return nombres;
	}

	/*
	 * Ejercicio 6: Realiza un método que reciba por parámetro una letra y devuelva
	 * todos los personajes de un videojuego que el nombre del personaje empiece y
	 * termine por esa letra. El método también recibirá un videojuego.
	 */

	public static ArrayList<Personaje> personajesQueEmpiezanYAcabanPor(char c, Videojuego videojuego) {
		var personajes = new ArrayList<Personaje>();
		for (Personaje personaje : videojuego.getPersonajes()) {
			if (empiezaYacaba(personaje.getNombre(), c)) {
				personajes.add(personaje);
			}
		}
		return personajes;
	}

	// metodo para comprobar si un personaje de un videojuego empieza y acaba x la
	// misma letra
	public static boolean empiezaYacaba(String personaje, char c) {
		var cumpleañosfeliz = false;
		if (personaje.startsWith(String.valueOf(c)) && personaje.endsWith(String.valueOf(c))) {
			cumpleañosfeliz = true;
		}
		return cumpleañosfeliz;
	}

	/*
	 * Ejercicio 7: Realiza un método que reciba por parámetro un arrayList de
	 * clientes (Este arraylist lleva dentro todos los clientes de las tiendas). El
	 * método recibirá por parámetro también un dni de un cliente, si ese cliente
	 * existe en el arraylist de clientes el método devolverá el objeto Cliente. El
	 * método se llamará “dameCliente”. Haz lo mismo para la entidad Empleado
	 * “dameEmpleado” que recibirá por parámetro un arraylist de empleados y un dni
	 * de un empleado. Haz lo mismo para la entidad Tienda “dameTienda” que recibirá
	 * por parámetro un arraylist de tiendas y el nº de tienda.
	 */

	public static Cliente dameCliente(ArrayList<Cliente> clientes, String dni) {
		var cliente = new Cliente();
		for (Cliente cliente1 : clientes) {
			if (cliente1.getDni().equalsIgnoreCase(dni)) {
				cliente = cliente1;
			}
		}
		return cliente;
	}

	public static Empleado dameEmpleado(ArrayList<Empleado> empleados, String dni) {
		var empleado = new Empleado();
		for (Empleado empleado1 : empleados) {
			if (empleado1.getDni().equalsIgnoreCase(dni)) {
				empleado = empleado1;
			}
		}
		return empleado;
	}

	public static Tienda dameTienda(ArrayList<Tienda> tiendas, String num_tienda) {
		var tienda = new Tienda();
		for (Tienda tienda1 : tiendas) {
			if (tienda1.getNum_tienda().equalsIgnoreCase(num_tienda)) {
				tienda = tienda1;
			}
		}
		return tienda;
	}

	/*
	 * Ejercicio 9: Realiza un método que de un alta de una venta en un arraylist de
	 * ventas pasado por parámetro. El método recibirá también por parámetro un dni
	 * de cliente, un dni de empleado, una fecha de venta, un arraylist de líneas de
	 * venta y un nº de tienda. El método también recibirá por parámetro un
	 * arraylist de clientes (Con todos los clientes de todas las tiendas), un
	 * arraylist de empleados (Con todos los empleados de todas las tiendas) y un
	 * arraylist de tiendas (Con todas las tiendas). Antes de hacer el alta deberás
	 * comprobar que el dni de cliente existe en el arraylis de clientes, que el dni
	 * del empleado existe en el arraylist de empleados y que el nº de tienda existe
	 * en el arraylist de tiendas. Si alguno de esos datos no existe deberás
	 * cancelar la operación de alta.
	 */
	
	
	/*
	 * Ejercicio 10: Realiza un método que devuelva un listado con los nombres de 
	 * los videojuegos más vendidos en orden descendiente. 
	 * El método recibirá como parámetro un arraylist de ventas. 
	 * El método devolverá un arraylist de Strings de la siguiente manera:
		Halo – 23
		FIFA22 – 20
		LOL – 18
		MineCraft – 15
		GTA5 – 10
		1. Creo un arraylist de Strings para meter los nombres de 
		todos los videojuegos que hay en el arraylist de ventas.
		2. Recorro todas las ventas y sus L_venta y voy insertando 
		los nombres de los videojuegos en el arraylist creado en el punto 1. Para no repetir 
		los videojuegos compruebo antes si el nombre del videojuego está o no yá 
		en el arraylist. Utilizo el método indexOf para ello.
		3. Md creo un array de enteros con la misma longitud que 
		el arraylist de videojuegos, para meter las unidades de cada videojuego. 
		La posición de cada unidad corresponderá al videojuego que está 
		en la misma posición del arraylist de videojuegos.
		4. Recorro el arraylist de nombres de videojuegos con un for each y 
		por cada nombre de videojuego recorro todas las ventas y sus l_venta 
		buscando ese nombre de videojuego, si es = acumulo las unidades 
		vendidas en una variable. Al finalizar meto el valor de esa variable en
		la posición del array de enteros donde guardo las unidades.
		5. Finalmente ordeno los 2 arrays en función del array de 
		unidades con orden decreciente.
	 * 
	 *
	 */
	
	

}
