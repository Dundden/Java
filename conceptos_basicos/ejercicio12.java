package conceptos_basicos;

import java.util.Scanner;

public class ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double kmh, ms;
		
		System.out.println("Ingrese los kilometros por hora");
		kmh = sc.nextDouble();
		ms = (kmh * 1000) / 3600;
		
		System.out.println("La cantidad de ms que recorre son " + ms);
		

	}

}
