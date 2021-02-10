package ed1;
import java.util.Scanner;
public class AppCalculadora {

	public static void main(String[] args) {
		inicio();
		menu();
		fin();
	}

	public static void fin() {
		System.out.println("--------------------------------");
		System.out.println("INICIO DEL PROGRAMA CALCULADORA");
		System.out.println("--------------------------------");
		
	}

	public static void menu() {
		int opcion = 10;
		do {
			
			switch (opcion) {
			case 1: Operaciones.sumar();
				
				break;

			case 2: Operaciones.restar();
				break;
			
			case 3: Operaciones.multiplicar();
				break;
			
			case 4: Operaciones.dividir();
				break;
				
			case 5: Operaciones.potencia();
				break;
				
			case 6: Operaciones.maximo();
				break;
				
			case 7: Operaciones.minimo();
				break;
				
			case 8: Operaciones.raiz();
				break;
			
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("¿Desea continuar? Introduzca 0 para salir");
			opcion = sc.nextInt();
			
		} while (opcion != 0);
		
	}

	public static void inicio() {
		System.out.println("--------------------------------");
		System.out.println("INICIO DEL PROGRAMA CALCULADORA");
		System.out.println("--------------------------------");
	}

}
