package conceptos_basicos;

import java.util.Scanner;

public class ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double c1, c2, h;
		
		System.out.println("Ingrese el cateto uno");
		c1 = sc.nextDouble();

		System.out.println("Ingrese el cateto dos");
		c2 = sc.nextDouble();
	
		h = (c1 * c1) + (c2 * c2);
		System.out.println("La ipotenusa es: " + Math.sqrt(h));
		

	}

}
