package capitulo4;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3, maximo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese dos numero");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		maximo = Maximo(n1, n2, n3);
		System.out.println("El numero maximo es " + maximo);
	}
	
	public static double Maximo (double n1, double n2, double n3) {
		double maximo;
		
		if (n1 > n2 && n1 > n3) {
			maximo = n1;
		}
		else if (n2 > n1 && n2 > n3) {
			maximo = n2;
		}
		else {
			maximo = n3;
		}
		
		return maximo;
	}

}
