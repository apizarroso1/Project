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

	public static void mostrarMenu(ArrayList<Libro> libros, ArrayList<Materia> materias) {
		int seleccion = 0;
		do {
			// Menú principal
			System.out.println("\n[1] Gestión de libros");
			System.out.println("\n[2] Gestión de lectores");
			System.out.println("\n[3] Gestión de préstamos");
			System.out.println("\n[4] Búsquedas");
			System.out.println("\n[5] Salir");

			seleccion = Validacion.leerNum();

			switch (seleccion) {
			case 1:
				GestionLibros.mostrarMenuLibros(libros, materias);
				break;
			case 2:
				GestionLectores.mostrarMenuLectores();// Función que abrirá el menú de gestion de lectores
				break;
			case 3:
				GestionPrestamos.mostrarMenuPrestamos();// Función que abrirá el menú de gestion de préstamos
				break;
			case 4:
				GestionBusquedas.mostrarMenuBusquedas();// Función que abrirá el menú de búsquedas
				break;
			case 5:
				mostrarFin();
				break;
			default:
				System.out.println("\nSelección inválida");
			}

		} while (seleccion != 5);

	}

}
