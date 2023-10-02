package capitulo4;
import java.util.*;
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, maximo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese dos numero");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		maximo = Maximo(n1, n2);
		System.out.println("El numero maximo es " + maximo);
	}
	
	public static double Maximo (double n1, double n2) {
		double maximo;
		
		if (n1 > n2) {
			maximo = n1;
		}
		else {
			maximo = n2;
		}
		
		return maximo;
	}

}
