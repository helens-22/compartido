package Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
	Ejercicio 9: Crea un array de 10 enteros y 
	rellénalo, Guardar en otro array los elementos pares del
	primer array, y a continuación 
	guarda en otro array los elementos impares.
		 */
		//Array
		int []num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i]=i;
		}
		//pares
		int cont=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0) {
				cont++;
			}
		}
		
		int[] numPares=new int[cont];
		cont=0;
		System.out.print("Pares para el csm de Gato: ");
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0) {
				numPares[cont]=num[i];
				System.out.print(numPares[cont] + ", ");
			}
		}
		System.out.println();
		//impar
		cont=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2!=0) {
				cont++;
			}
		}
		int[] numImpares=new int[cont];
		cont=0;
		System.out.print("Impares para el csm de Gato: ");
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2!=0) {
				numImpares[cont]=num[i];
				System.out.print(numImpares[cont]+", ");
			}
		}
		
	}

}
