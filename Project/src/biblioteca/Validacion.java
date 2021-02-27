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

		System.out.println("\nPulse espacio para continuar");
		sc.nextLine();

	}
}
