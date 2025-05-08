package Arrays;

public class Ejercicio11 {
	public static void main(String[] args) {
		/*
		 * 8. Combinar dos Arrays en un tercer Array Dado dos arrays de enteros de igual
		 * tamaño, crea un tercer array que contenga la suma de los elementos en la
		 * misma posición de los otros dos.
		 */
		var nums1 = new int[25];
		var nums2 = new int[48];
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = i;
			
		}
		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = i;
		}
		
		var nums3 = new int[nums1.length + nums2.length];
		var cont=0;
		for (int i = 0; i < nums1.length; i++) {
			nums3[cont]=nums1[i];
			cont++;			
		}
		for (int i = 0; i < nums2.length; i++) {
			nums3[cont]=nums2[i];
			cont++;			
		}
		for (int i : nums3) {
			System.out.println(i);
		}
		

	}
	
	
}
