package OOP;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		var coche1 = new Coche();
		System.out.println(coche1.toString());
		coche1.setColor("Rojo");
		coche1.setCv(456);
		coche1.setMatricula("4123CSA");
		System.out.println(coche1.toString());
		
	}
	public static int devolverCocheMasCV(ArrayList<Coche> coches){
		var masCV = Integer.MIN_VALUE;
		var cocheMas = new Coche();
		for (Coche coche : coches) {
			if(coche.getCv()> masCV) {
				masCV= coche.getCv();
				cocheMas = coche;
			}
		}
		return masCV;
	}
	
}
