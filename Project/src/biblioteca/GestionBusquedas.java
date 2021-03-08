package biblioteca;

import java.util.ArrayList;

public class GestionBusquedas {

	public static void mostrarMenuBusquedas(ArrayList<Libro> libros) {
		String seleccion = "0";
		do {
			System.out.println("\n[1] Busqueda por autor");
			System.out.println("\n[2] Busqueda por titulo");
			System.out.println("\n[3] Busqueda por materia");
			System.out.println("\n[4] Salir");

			seleccion = Validacion.leerOpcion();

			switch (seleccion) {
			case "1":
				buscarPorAutor(libros);
				break;
			case "2":
				buscarPorTitulo(libros);
				break;
			case "3":
				buscarPorMateria(libros);
				break;
			case "4":
				salirMenuBusquedas();
				break;
			default:
				System.out.println("\nSeleccion invalida");
			}

		} while (!seleccion.equals("4"));
	}

	public static void buscarPorAutor(ArrayList<Libro> libros) {
		String autor;

		autor = Validacion.leerString("\nIntroduzca el autor para buscar sus libros");

		if (libros.size() > 0) {
			for (Libro l : libros) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					System.out.println(l.mostrarDatos());
				}
			}

			System.out.println("\nFin del listado de libros");

		} else {
			System.out.println("\nNo hay libros registrados");
		}

		Validacion.solicitarIntro();
	}

	public static void buscarPorTitulo(ArrayList<Libro> libros) {
		String titulo;

		titulo = Validacion.leerString("\nIntroduzca el titulo para buscar libros");

		if (libros.size() > 0) {
			for (Libro l : libros) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					System.out.println(l.mostrarDatos());
				}
			}

			System.out.println("\nFin del listado de libros");

		} else {
			System.out.println("\nNo hay libros registrados");
		}

		Validacion.solicitarIntro();
	}

	public static void buscarPorMateria(ArrayList<Libro> libros) {
		String materia;

		materia = Validacion.leerString("\nIntroduzca la materia para buscar las obras que pertenezcan");

		if (libros.size() > 0) {
			for (Libro l : libros) {
				if (l.getMateria().equalsIgnoreCase(materia)) {
					System.out.println(l.mostrarDatos());
				}
			}

			System.out.println("\nFin del listado de libros");

		} else {
			System.out.println("\nNo hay libros registrados");
		}

		Validacion.solicitarIntro();
	}

	public static void salirMenuBusquedas() {
		System.out.println("\nHa abandonado el menu de busquedas");
	}
}
