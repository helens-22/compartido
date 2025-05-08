package Arrays;

public class Ejercicio4 {
	public static void main(String[] args) {
		/*
		 * Ejercicio 5: Genera 1000 números aleatorios entre 0 y 100 de valor. Por cada
		 * nº aleatorio generado que sea el 1 deberás mostrar en pantalla el nº de
		 * números que se han introducido anteriormente hasta que salió el 1.
		 */

		int[] nums = new int[1000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100);
		}
		var cont=0;
		for (int num : nums) {
			if(num==1) {
				System.out.println(cont);
			}
			cont++;
		}
	}

}
