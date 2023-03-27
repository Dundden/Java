package conceptos_basicos;
import java.util.*;

public class ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double gc, gf;
		
		System.out.println("Ingrese los grados celsius");
		gc = sc.nextDouble();
		gf = 32 + ( 9 * gc / 5);
		System.out.println("Los grados pasados a farenheit son " + gf);


	}

}
