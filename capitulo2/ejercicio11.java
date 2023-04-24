package programacion;
import java.util.*;

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese una nota");
		n = sc.nextInt();
		
		if (n <= 0 || n <= 4) {
			System.out.println("Insuficiente");
		}
		
		switch(n) {
		case 5:
			System.out.println("Suficiente");
		break;
		case 6:
			System.out.println("Bien");
		break;
		case 7:
			System.out.println("Notable");
		break;
		case 8:
			System.out.println("Notable");
		break;
		case 9:
			System.out.println("Sobresaliente");
		break;
		case 10:
			System.out.println("Sobresaliente");
		break;
		}
		

	}
}
