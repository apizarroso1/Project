package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionPrestamos {

	public static void mostrarMenuPrestamos(ArrayList<Libro> libros, ArrayList<Lector> lectores,
			ArrayList<Prestamo> prestamos) {
		String seleccion = "0";
		do {
			System.out.println("\n[1] Anotar prestamo");
			System.out.println("\n[2] Anotar devolucion");
			System.out.println("\n[3] Listar morosos");
			System.out.println("\n[4] Prestamos del lector");
			System.out.println("\n[5] Salir");

			seleccion = Validacion.leerOpcion();

			switch (seleccion) {
			case "1":
				anotarPrestamo(libros, lectores, prestamos);
				break;
			case "2":
				anotarDevolucion(prestamos);
				break;
			case "3":
				listarMorosos(prestamos);
				break;
			case "4":
				buscarPrestamosLector(prestamos);
				break;
			case "5":
				salirMenuPrestamos();
				break;
			default:
				System.out.println("\nSeleccion invalida");
			}

		} while (!seleccion.equals("5"));
	}

	public static void anotarPrestamo(ArrayList<Libro> libros, ArrayList<Lector> lectores,
			ArrayList<Prestamo> prestamos) {
		boolean continuar = false;
		int libro, lector, cant;
		LocalDate fecha = null;
		Prestamo p = new Prestamo();

		GestionLibros.mostrarTodosLibros(libros);

		libro = Validacion.leerInt("\nSeleccione el libro a tomar prestado mediante su codigo");
		libro--;

		GestionLectores.mostrarTodosLectoresSinbaja(lectores);

		lector = Validacion.leerInt("\nSeleccione el lector que realizara el prestamo");
		lector--;

		fecha.now();

		p.setFecha(fecha);
		p.setLector(lectores.get(lector));
		p.setLibro(libros.get(libro));

		p.mostrarDatos();

		continuar = Validacion.validarRespuesta();

		if (continuar) {

			cant = libros.get(libro).getCantEjemplares();
			cant--;
			libros.get(libro).setCantEjemplares(cant);
			prestamos.add(p);

			System.out.println("\nPrestamo realizado");

		} else {

			System.out.println("\nHa cancelado la anotacion de prestamo");

			Validacion.solicitarIntro();
		}
	}

	public static void anotarDevolucion(ArrayList<Prestamo> prestamos) {
		int prestamo;
		boolean continuar = false;

		mostrarTodosPrestamosSinDevolver(prestamos);

		prestamo = Validacion.leerInt("\nSeleccione el prestamo a devolver mediante su codigo");
		prestamo--;

		if (prestamos.contains(prestamos.get(prestamo))) {

			if (!prestamos.get(prestamo).isDevuelto()) {
				prestamos.get(prestamo).mostrarDatos();

				continuar = Validacion.validarRespuesta();

				if (continuar) {
					System.out.println("\nEl prestamo ha sido devuelto");

					prestamos.get(prestamo).setDevuelto(true);

					Validacion.solicitarIntro();

				} else {
					System.out.println("\nLa operacion se ha cancelado");

					Validacion.solicitarIntro();
				}
			}
		} else {
			System.out.println("\nEl prestamo no existe");

			Validacion.solicitarIntro();
		}
	}

	public static void listarMorosos(ArrayList<Prestamo> prestamos) {

		mostrarTodosPrestamosSinDevolver(prestamos);

		System.out.println("\nFin del listado de morosos");

		Validacion.solicitarIntro();
	}

	public static void buscarPrestamosLector(ArrayList<Prestamo> prestamos) {
		int lector;
		boolean continuar;

		for (Prestamo p : prestamos) {
			p.mostrarDatos();
			System.out.println(prestamos.indexOf(p) + 1);
		}

		lector = Validacion.leerInt("\nSeleccione el lector para mostrar sus prestamos mediante su codigo");
		lector--;

		System.out.println(prestamos.get(lector).getLector());

		continuar = Validacion.validarRespuesta();

		if (continuar) {

			if (!prestamos.get(lector).devuelto) {
				prestamos.get(lector).mostrarLibroAbreviado();

				System.out.println("\n" + prestamos.get(lector).getFecha());

				Validacion.solicitarIntro();
			} else {

				System.out.println("\nEl lector no tiene libros por devolver");
				Validacion.solicitarIntro();
			}
		} else {
			System.out.println("\nLa operacion se ha cancelado");
			Validacion.solicitarIntro();
		}
	}

	public static void mostrarTodosPrestamosSinDevolver(ArrayList<Prestamo> prestamos) {
		for (Prestamo p : prestamos) {
			if (!p.isDevuelto()) {
				p.mostrarDatos();
				System.out.println(prestamos.indexOf(p) + 1);
			}
		}
	}
	
	public static void salirMenuPrestamos() {
		System.out.println("\nHa abandonado el menu de gestion de prestamos");
	}
}
