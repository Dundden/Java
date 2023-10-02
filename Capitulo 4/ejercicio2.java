package capitulo4;
import java.util.*;
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n1, n2;
		
		System.out.println("Ingrese dos numeros");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		Numeros(n1, n2);
	}
	
	public static void Numeros(int n1, int n2) {
		int a;
		if (n1 > n2) {
			a = n1;
			n1 = n2;
			n2 = a;
			
		}
		
		for (int i = n1 + 1; i < n2; i++) {
			System.out.print(i + " "); 
		}
	}

}
