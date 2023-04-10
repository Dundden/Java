package capitulo2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, n2;
		
		System.out.println("Ingrese un numero");
		n = sc.nextInt();
		System.out.println("Ahora otro");
		n2 = sc.nextInt();
		
		if (n == n2) {
			System.out.println("Los numeros son iguales");
		}
		else {
			System.out.println("Los numeros no son iguales");
		}
	}

}
