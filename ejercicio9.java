package capitulo4;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero");
        numero = sc.nextInt();
        contarDivisoresPrimos(numero);
        
       
    }

	public static void contarDivisoresPrimos(int numero) {
        int contador = 0;
        
        for (int i = 2; i <= numero; i++) {
        	if (esPrimo(i) && numero % i == 0) {
        		contador = mostrarPrimo(i);
            	System.out.println("Se ha encontrado un divisor primo: " + contador);
        	}
        	
        }
        
        
    } 
    
    public static int mostrarPrimo(int numero) {
    	boolean primo = true;
    	int esPrimo = 0;
        if (numero <= 1) {
            primo = false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }
        
        if (primo = true) {
        	esPrimo = numero;
        }
        
		return esPrimo;
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }

}
