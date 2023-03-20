package conceptos_basicos;
import java.util.*;
public class ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		int cont;
		double promedio = 0;
		int i = 0;
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese cuantos numeros quiere sacar la media");
		cont = sc.nextInt();
		
		while (i < cont){
			System.out.println("ingrese un numero");
			n = sc.nextInt();
			i++;
			promedio = promedio + n;
		}
		
		promedio = promedio / cont;
		System.out.println("el promedio es " + promedio);
	}

}
