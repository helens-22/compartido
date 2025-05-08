package Arrays;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 Ejercicio 1: Lee por teclado 25 números y 
		 muéstralos en pantalla en orden inverso al introducido
			recorriendo el array.
		 */
		//Array
		int[] num = new int[25];
		for (int i = 0; i < num.length; i++) {
			num[i]=i;
		}
		for (int i = num.length -1; i >=0; i--) {
			
			//System.out.print(num[i] + ", ");
		}
		//ArrayList
		ArrayList<Integer> numeros = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			numeros.add(i);
		}
		for (int i = numeros.size()-1; i >=0; i--) {
			System.out.print(numeros.get(i) + ", ");
		}
		
	}

}
