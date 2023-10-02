package capitulo4;

import java.util.Scanner;

public class ejercicio8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numero;
        numero = sc.nextInt();
        int resultado = contarDivisoresPrimos(numero);
        
        System.out.println("El número de divisores primos de " + numero + " es: " + resultado);
    }

	public static int contarDivisoresPrimos(int numero) {
        int contador = 0;
        
        for (int i = 2; i <= numero; i++) {
            if (esPrimo(i) && numero % i == 0) {
                contador++;
            }
        }
        
        return contador;
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
