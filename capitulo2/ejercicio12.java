package programacion;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d, m, a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese los dias");
		d = sc.nextInt();
		System.out.println("Ingrese los meses");
		m = sc.nextInt();
		System.out.println("Ingrese los años");
		a = sc.nextInt();
		
		if (m == 2 && d > 28) {
			System.out.print("Febrero no tiene mas de 28 dias");
		}
		if (m == 7 && d > 30) {
			System.out.println("Julio no tiene mas de 30 dias");
		}
		if(m == 8 && d > 31) {
			System.out.println("Agosto no tiene mas de 31 disas");
		}
		if (d > 32) {
			System.out.print("Ningun mes tiene mas de 31 dias");
		}
	}

}
