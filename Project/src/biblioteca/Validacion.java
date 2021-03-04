package biblioteca;

import java.util.Scanner;

public class Validacion {
	public static int leerNum() {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		return num;
	}

	public static boolean validarRespuesta() {
		Scanner sc = new Scanner(System.in);
		String respuesta;
		boolean confirmacion = false;

		do {
			System.out.println("\nConfirme la operación: ");
			respuesta = sc.nextLine();
		} while (respuesta.equalsIgnoreCase(" "));

		if (respuesta.equalsIgnoreCase("s")) {
			solicitarIntro();

			confirmacion = true;
		} else {
			if (respuesta.equalsIgnoreCase("n")) {
				confirmacion = false;
			}
		}

		return confirmacion;
	}

	public static void solicitarIntro() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nPulse intro para continuar");
		sc.nextLine();

	}
	
	public static String leerString(String mensaje) {
		Scanner sc = new Scanner(System.in);
		String string = " ";
		
		System.out.println(mensaje);
		string = sc.nextLine();
		
		return string;
	}
	
	public static int leerInt(String mensaje) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		System.out.println(mensaje);
		i = sc.nextInt();
		
		return i;
	}
}
