package Arrays;

public class Array1 {

	public static void main(String[] args) {
		int[] numeros = new int[50];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}
		int contador = 0;
		
		// Contar los numeros pares
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				contador++;
			}
		}
		
		int[] numerosPares = new int[contador];
		contador = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
//				Aqui en esta linea necesitamos de una variable temporal para rellenar el array 
				numerosPares[contador] = numeros[i];
				contador++;
			}
		}
		for (int i : numerosPares) {
			System.out.println("Numero par: " + i);
		}
		
		
		
	} 	
}
