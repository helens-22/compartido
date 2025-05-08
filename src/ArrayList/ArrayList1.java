package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
	
	
	public static void main(String[] args) {
			
		ArrayList<Integer> numeros = new ArrayList<>();
		
		// Hemos decidido que tenga 5 posiciones pero le mon
				
		ArrayList<Integer> numerosPares = new ArrayList<>();
		// Size nos sirve para saber el tamaño (Para recorrerlo)
		for (int i = 0; i < numeros.size(); i++) {
			// Con .get(i) hacemos lo mismo que con 
			// [i] nos vale para tener el valor de la posicion
			if(numeros.get(i) % 2 == 0) {
				numerosPares.add(numeros.get(i));
			}
		}
		
		 for (Integer num : numerosPares) {
			if (num % 2 == 0) {
				// Add Añade valores al ArrayList
				numerosPares.add(num);
			}
		}
		
	}

}
