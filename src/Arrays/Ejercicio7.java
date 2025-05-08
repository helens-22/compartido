package Arrays;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * 2. Buscar un número en un Array Escribe un programa que busque un número en
	 * un array y devuelva su posición (o un mensaje si no está en el array).
	 */
	public static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] num = new int[25];
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		System.out.println(numGrande(num));

	}

	public static int buscarNumero(int[] numeros) {
		System.out.println("Introduza el num q quieres buscar: ");
		var num = sn.nextInt();
		for (int i = 0; i < numeros.length; i++) {
			int j = numeros[i];
			if (num == j) {
				return i;
			}
		}
		return 0;
	}
	/*
	 3. Encontrar el número más grande en un Array
	Dado un array de enteros, encuentra el mayor número dentro de él.
	 */
	public static int numGrande(int[]numeros) {
		var numMax = Integer.MIN_VALUE;
		for (int i = 0; i < numeros.length; i++) {
			int j = numeros[i];
			if(j>numMax) {
				numMax= j;
			}
		}
		return numMax;
	}
	
}
