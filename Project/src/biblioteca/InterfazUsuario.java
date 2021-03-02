package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfazUsuario {
	public static void mostrarInicio() {
		System.out.println("--------------------------------");
		System.out.println("\nINICIO DEL PROGRAMA BIBLIOTECA");
		System.out.println("\n--------------------------------");
	}

	public static void mostrarFin() {
		System.out.println("\n--------------------------------");
		System.out.println("\nFIN DEL PROGRAMA BIBLIOTECA");
		System.out.println("\n--------------------------------");
		Scanner sc = new Scanner(System.in);
		sc.close();
	}

	public static void mostrarMenu(ArrayList<Libro> libros, ArrayList<Materia> materias, ArrayList<Lector> lectores) {
		int seleccion = 0;
		do {
			// Men� principal
			System.out.println("\n[1] Gesti�n de libros");
			System.out.println("\n[2] Gesti�n de lectores");
			System.out.println("\n[3] Gesti�n de pr�stamos");
			System.out.println("\n[4] B�squedas");
			System.out.println("\n[5] Salir");

			seleccion = Validacion.leerNum();

			switch (seleccion) {
			case 1:
				GestionLibros.mostrarMenuLibros(libros, materias);
				break;
			case 2:
				GestionLectores.mostrarMenuLectores(lectores);// Funci�n que abrir� el men� de gestion de lectores
				break;
			case 3:
				GestionPrestamos.mostrarMenuPrestamos();// Funci�n que abrir� el men� de gestion de pr�stamos
				break;
			case 4:
				GestionBusquedas.mostrarMenuBusquedas();// Funci�n que abrir� el men� de b�squedas
				break;
			case 5:
				mostrarFin();
				break;
			default:
				System.out.println("\nSelecci�n inv�lida");
			}

		} while (seleccion != 5);

	}

}
