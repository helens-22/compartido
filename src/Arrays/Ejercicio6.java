package Arrays;

import java.util.Scanner;

public class Ejercicio6 {

	public static final Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] nums = new int[666];
		for (int i = 0; i < nums.length; i++)
			nums[i] = (int) (Math.random() * 100);
		System.out.println(numMayorArray(nums));

	}
	
	/*
	 * 2. Buscar un número en un Array. Escribe un programa que busque un número en
	 * un array y devuelva su posición (o un mensaje si no está en el array).
	 */
	
	public static int posicionArray(int[] nums) {
		System.out.println("introduce un num: ");
		var num = sn.nextInt();
		var cont=0;
		for (int i : nums) {
			if (num==i) {
				return cont;
			}
			cont++;
		}
		System.out.println("No se ha encontrado la posicion");
		return 0;
	}
	/*
	3. Encontrar el número más grande en un Array
	Dado un array de enteros, encuentra el mayor número dentro de él.
	 */
	public static int numMayorArray(int[]nums) {
		var numMayor= Integer.MIN_VALUE;
		for (int i : nums) {
			if(i>numMayor) {
				numMayor=i;
			}
		}
		return numMayor;
	}

}
