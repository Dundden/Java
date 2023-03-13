package conceptos_basicos;
import java.util.*;
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		int prox;
		
		System.out.println("Ingrese su edad");
		Scanner sc = new Scanner(System.in);
		edad = sc.nextInt();
		
		prox = edad + 1;
		
		System.out.println("su edad el proximo año sera de " + prox + " años");

	}

}
