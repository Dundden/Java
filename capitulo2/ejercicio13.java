package programacion;
import java.util.*;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s, m , h;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese los segundo");
		s = sc.nextInt();
		System.out.println("Ingrese los minutos");
		m = sc.nextInt();
		System.out.println("Ingrese las horas");
		h = sc.nextInt();
		
		if (s >= 60) {
			m += 1;
			s = 0;
		}
		
		if (m >= 60) {
			h += 1;
			m = 0;
		}
		
		System.out.println(h + ":" + m + ":" + s);
	}

}
