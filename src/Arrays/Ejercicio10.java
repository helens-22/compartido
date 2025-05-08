package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * 7. Eliminar un elemento de un ArrayList Crea un ArrayList de nombres y
		 * permite al usuario ingresar un nombre para eliminarlo de la lista.
		 */
		var nombres= new ArrayList<String>();
		nombres.add("Gato");
		nombres.add("Jelen");
		nombres.add("Iryo");
		eliminarNombre(nombres);
		System.out.println(nombres);
	}
	public static void eliminarNombre(ArrayList<String> nombres) {
		System.out.println("Ingrese un nombre que quiera eliminar: ");
		var nombre= sc.nextLine();
		nombres.remove(nombre);
		
	}

}
