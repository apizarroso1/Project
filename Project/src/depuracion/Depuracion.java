package depuracion;
import java.util.Scanner;

public class Depuracion {

	public static void main(String[] args) {
		numerosYSuma();
	}
	
	public static void numerosYSuma() {
		
		Scanner sc = new Scanner(System.in);
		
		double suma = 0;
		int  contador = 0;
		double dato = 0;
		
		System.out.print("Introduzca un numero: ");
		while ((dato = sc.nextDouble())!= 0) {
			suma = suma + dato;
			contador +=1;
			
			System.out.print("\nIntroduzca un numero: ");
			 
		}
		
		System.out.println("Ha introducido " + contador + " datos, y su suma es: " + suma);
		sc.close();
	}
}
