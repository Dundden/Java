package conceptos_basicos;

import java.util.*;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		int año;
		int diferencia;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su año de nacimiento ");
		edad = sc.nextInt();
		System.out.println("Ingrese el año actual");
		año = sc.nextInt();
		diferencia = año - edad;
		System.out.println("Su edad es: " + diferencia);
	}

}
