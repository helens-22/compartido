package Arrays;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		int[] nums = new int[666];
		for (int i = 0; i < nums.length;i++) nums[i] = (int) (Math.random()*100);
		
		System.out.println(sumaNumsArray(nums));
		System.out.println(restaNumsArray(nums));
		System.out.println(multNumsArray(nums));
		System.out.println(divNumsArray(nums));
	}
	/*
	 	1. Suma de elementos en un Array
		Crea un programa que reciba un array de enteros 
		y calcule la suma de todos sus elementos.
		
	 */
	public static int sumaNumsArray(int[] nums) {
		var suma = 0;
		for (int num : nums) {
			suma+=num;
		}
		return suma;
	}
	public static int restaNumsArray(int[] nums) {
		var resta = 0;
		for (int num : nums) {
			resta-=num;
		}
		return resta;
	}
	public static int divNumsArray(int[] nums) {
		var div = 0;
		for (int num : nums) {
			div/=num;
		}
		return div;
	}
	public static int multNumsArray(int[] nums) {
		var mult = 0;
		for (int num : nums) {
			mult*=num;
		}
		return mult;
	}
}
