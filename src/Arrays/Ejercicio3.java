package Arrays;

public class Ejercicio3 {
	public static void main(String[] args) {
		/*
		 * Ejercicio 6: Lee por teclado un array de 10 números. Crea un nuevo arraylist
		 * con 16 posiciones, las 3 primeras posiciones y las 3 últimas deberán tener
		 * ceros. El resto de posiciones deberás rellenarlo con los números que hay en
		 * el primer array. Muestra el contenido y la longitud del arraylist
		 */
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100);
		}

		int[] nums2 = new int[16];
		nums2[0]=0;
		nums2[1]=0;
		nums2[2]=0;
		
		nums2[nums.length-1]=0;
		nums2[nums.length-2]=0;
		nums2[nums.length-3]=0;
		var contador = 0;
		for (int i = 3; i < nums2.length-3; i++) {
			nums2[i]=nums[contador];
			contador++;
		}
		for (int num : nums2) {
			System.out.println(num);
		}
		
		System.out.println(nums2.length);
	
	}
}
