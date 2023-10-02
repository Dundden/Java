package capitulo4;
import java.util.*;
public class ejercicio6 {

	public static void main(String[] args) {
		String letra;
		boolean vocal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una letra");
		letra = sc.next();
		vocal = Vocal(letra);
		
		if(vocal == true) {
			System.out.print("Su letra es una vocal");
		}
		
		
	}
	
	public static boolean Vocal(String letra) {
		boolean vocal = false;
		
		if (letra.equals("a")  || letra.equals("e")  || letra.equals("i") || letra.equals("o") || letra.equals("u") ) {
			vocal = true;
		}
		
		return vocal;
	}

}
