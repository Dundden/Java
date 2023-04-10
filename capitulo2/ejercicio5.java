package capitulo2;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double n;
		
		System.out.println("Ingrese un numero");
		n = sc.nextDouble();
		
		if (n < 1 && n >-1) {
			System.out.println("Su numero es casi cero");
		}
		else {
			System.out.println("Su numero no es casi cero");
		}

	}

}
