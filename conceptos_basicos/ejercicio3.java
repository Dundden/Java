package conceptos_basicos;

import java.util.*;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		int a�o;
		int diferencia;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su a�o de nacimiento ");
		edad = sc.nextInt();
		System.out.println("Ingrese el a�o actual");
		a�o = sc.nextInt();
		diferencia = a�o - edad;
		System.out.println("Su edad es: " + diferencia);
	}

}
