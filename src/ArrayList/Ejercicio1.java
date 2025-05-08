package ArrayList;

import java.util.ArrayList;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*
		 * Ejercicio 6: Lee por teclado un array de 10 números. Crea un nuevo arraylist
		 * con 16 posiciones, las 3 primeras posiciones y las 3 últimas deberán tener
		 * ceros. El resto de posiciones deberás rellenarlo con los números que hay en
		 * el primer array. Muestra el contenido y la longitud del arraylist
		 */
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random()*100);
		}
		
		ArrayList<Integer> numsList= new ArrayList<>();
		numsList.add(0);		numsList.add(0);
		numsList.add(0);
		
		for (int i = 0; i < nums.length; i++) {
			numsList.add(nums[i]);
		}
		
		numsList.add(0);
		numsList.add(0);
		numsList.add(0);
		
		for (Integer num : numsList) {
			System.out.println(num);
		}
		
		System.out.println("La longitud del arraylist es de: "+ numsList.size());
		
		
	}
}
