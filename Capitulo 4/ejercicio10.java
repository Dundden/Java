/*
 * Escribir una función que decida si dos números enteros positivos 
 * son amigos. Dos números son 
 * amigos si la suma de sus divisores propios
 *  (distintos de ellos mismos) son iguales.
 * 
 */

package capitulo4;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, num2;
		boolean amigos;
		
		System.out.println("Ingrese dos numeros");
		num = sc.nextInt();
		num2 = sc.nextInt();
		amigos = sonAmigos(num, num2);
		
		if (amigos = true) {
			System.out.println("Son amigos");
		}
		else {
			System.out.println("No son amigos");
		}

	}
	
	public static boolean sonAmigos(int num, int num2) {
		boolean amigos = false;
		int div = 0, div2 = 0;
		
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
	            div += i;
	        }	
		}
		
		for(int i = 1; i <= num2; i++) {
			if (num2 % i == 0) {
	            div2 += i;
	        }	
		}
		
		if (div == div2) {
			amigos = true;
		}
		
		return amigos;
		
	}

}
