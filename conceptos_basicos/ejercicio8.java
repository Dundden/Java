package conceptos_basicos;

import java.util.Scanner;

public class ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float manzanas, manzanas2, manzanas3, pm;
		float peras, peras2, peras3, pp;
		int total;

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de kilogramos de manzanas y peras vendidas en cada trimestre");
		System.out.println("Trimestre 1: (Manzanas) (Peras)");
		manzanas = sc.nextFloat();
		peras = sc.nextFloat();
		System.out.println("Trimestre 2: (Manzanas) (Peras) ");
		manzanas2 = sc.nextFloat();
		peras2 = sc.nextFloat();
		System.out.println("Trimestre 3: (Manzanas) (Peras) ");
		manzanas3 = sc.nextFloat();
		peras3 = sc.nextFloat();
		
		total = (int) ((manzanas + manzanas2 + manzanas3) *  2.35 + (peras + peras2 + peras3) * 1.95);

	}

}
