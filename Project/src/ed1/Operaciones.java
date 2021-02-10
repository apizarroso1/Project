package ed1;

import java.util.Scanner;

public class Operaciones {
	
	
		
	
	public static float sumar(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer operador");
		Float num1 = sc.nextFloat();
		System.out.println("Introduzca el segundo operador");
		Float num2 = sc.nextFloat();
		
		float suma = (num1 + num2);
		
		return suma;
		
	}
	
	public static float restar(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer operador");
		Float num1 = sc.nextFloat();
		System.out.println("Introduzca el segundo operador");
		Float num2 = sc.nextFloat();
		
		float resta = (num1 - num2);
		return resta;
		
	}
	
	public static float multiplicar(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer operador");
		Float num1 = sc.nextFloat();
		System.out.println("Introduzca el segundo operador");
		Float num2 = sc.nextFloat();
		
		float producto = (num1 * num2);
		return producto;
	}
	
	public static float dividir(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer operador");
		Float num1 = sc.nextFloat();
		System.out.println("Introduzca el segundo operador");
		Float num2 = sc.nextFloat();
		
		float cociente = (num1/num2);
		return cociente;
		
	}
	
	public static double potencia(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer operador");
		Float num1 = sc.nextFloat();
		System.out.println("Introduzca el segundo operador");
		Float num2 = sc.nextFloat();
		
		double resultado = Math.pow(num1, num2);
		return resultado;
	}
	
	public static float maximo(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer operador");
		Float num1 = sc.nextFloat();
		System.out.println("Introduzca el segundo operador");
		Float num2 = sc.nextFloat();
		
		float maximo;
		
		if (num1 > num2) {
			 maximo = num1;
		}
		else {
			 maximo = num2;
		}
		
		return maximo;
		
	}
	
	public static float minimo(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer operador");
		Float num1 = sc.nextFloat();
		System.out.println("Introduzca el segundo operador");
		Float num2 = sc.nextFloat();
		
		float minimo;
		
		if (num1 < num2) {
			minimo = num1;
		}
		else {
			minimo = num2;
		}
		
		return minimo;
		
	}
	
	public static void raiz(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer operador");
		Float num1 = sc.nextFloat();
		System.out.println("Introduzca el segundo operador");
		Float num2 = sc.nextFloat();
		
		float resultado = Math.
		
	}
}

