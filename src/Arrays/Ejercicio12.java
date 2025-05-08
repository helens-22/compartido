package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio12 {
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * 9. Encontrar el índice de un número en un ArrayList Crea un ArrayList de
		 * enteros y permite al usuario ingresar un número para encontrar su índice en
		 * la lista.
		 */

		var nums = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			nums.add(i);
		}
		System.out.println("ingresa un num ctm: ");
		var num = sc.nextInt();

		for (int i = 0; i < nums.size(); i++) {
			if (num == nums.get(i)) System.out.println("La posicion donde esta el numero es:" + i);
		}
	}

}
