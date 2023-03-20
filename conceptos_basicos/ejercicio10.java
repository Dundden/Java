package conceptos_basicos;

import java.util.Scanner;

public class ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio, area, longitud;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el radio del circulo");
		radio = sc.nextFloat();
		area = radio * radio * 3.14;
		longitud = radio * 2;
		
		System.out.println("Area: " + area + "CM " + "Longitud: " + longitud + "CM");

	}

}
