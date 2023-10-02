package capitulo4;
import java.util.*;
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		float altura, radio;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una de estas opciones");
		System.out.println("1_ Volumen de un cilindro");
		System.out.println("2_ Area de un cilindro");
		
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Ingrese el radio del cilindro");
			radio = sc.nextFloat();
			System.out.println("Ingrese la altura del cilindro");
			altura = sc.nextFloat();
			double volumen = Volumen(radio, altura);
			System.out.println("Volumen: " + volumen);
		break;
		case 2:
			System.out.println("Ingrese el radio del cilindro");
			radio = sc.nextFloat();
			System.out.println("Ingrese la altura del cilindro");
			altura = sc.nextFloat();
			double area = Area(radio, altura);
			System.out.println("Area: " + area);
			
		break;
			
		}
	}
	
	public static double Volumen (float radio, float altura) {
		double volumen;
		
		volumen = 3.14 * (radio * 2) * altura  ;
		
		return volumen;
	}
	
	public static double Area (float radio, float altura) {
		double area;
		
		area = (3.14 * 2) * radio * (altura + radio);
		
		return area;
	}

}
