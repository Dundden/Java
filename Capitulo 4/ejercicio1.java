package capitulo4;
import java.util.*;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Infrese un numero");
		n = sc.nextInt();
		Eco(n);
	}
	
	public static void Eco(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("Eco ");
		}
	}

}
