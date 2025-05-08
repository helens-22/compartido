package Arrays;

import java.util.Scanner;

public class Ejercicio8 {
	public static Scanner sn = new Scanner(System.in);
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] num = new int[25];
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		devolverArray(num);
	}

	public static int[] copiarArray(int[] numeros) {
		int[] copiaNumeros = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			copiaNumeros[i] = numeros[i];

		}
		return copiaNumeros;
	}
	/*
	 * 5. Contar elementos pares e impares en un Array Dado un array de enteros,
	 * cuenta cuántos números son pares y cuántos son impares.
	 * 2 Metodos 1 cuenta pares y otro impares luego en otro metodo mostraras el contenido del array 
	 * 1,2,3..
	 * Y total pares: 
	 * Total impares: 
	 */
	public static int contarPares(int[]numeros) {
		var pares=0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%2==0) {
				pares++;
			}
		}
		return pares;
	}
	public static int contarImpares(int[]numeros) {
		var impares=0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%2!=0) {
				impares++;
			}
		}
		return impares;
	}
	
	public static void devolverArray(int[]numeros) {
		for (int i = 0; i < numeros.length; i++) {
			int j = numeros[i];
			System.out.print(j + ", ");
		}
		System.out.println();
		System.out.println("Total pares: " + contarPares(numeros));
		System.out.println("Total impares: " + contarImpares(numeros));
	}
	
	public static boolean esPar (int num) {
		return (num%2==0);
	}
	
	public static int contPares (int[] n) {
		var contPar = 0;
		for (int i : n) if (esPar(i)) contPar++;
		return contPar;
	}
	public static int contImpares (int[] n) {
		var contImpar = 0;
		for (int i : n) if (!esPar(i)) contImpar++;
		return contImpar;
	}
	public static void salida(int[] n) {
		for (int i : n) {
			System.out.print(n +", ");
		}
		System.out.println("\n Total pares: " + contPares(n));
		System.out.println("Total impares: " + contImpares(n));
	}
	
}
