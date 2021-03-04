package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class GestionLibros {

	// Menu para la gestión de libros
	public static void mostrarMenuLibros(ArrayList<Libro> libros, ArrayList<Materia> materias, ArrayList<Baja> bajas) {
		int seleccion = 0;
		do {
			System.out.println("\n[1] Alta de libro");
			System.out.println("\n[2] Baja de libro");
			System.out.println("\n[3] Anular baja de libro");
			System.out.println("\n[4] Actualizar libro");
			System.out.println("\n[5] Listar libros");
			System.out.println("\n[6] Compactar registro de libros");
			System.out.println("\n[7] Actualizar lista de materias");
			System.out.println("\n[8] Salir");

			seleccion = Validacion.leerNum();

			switch (seleccion) {
			case 1:
				altaLibro(libros, materias, bajas);
				break;
			case 2:
				bajaLibro(libros, bajas);
				break;
			case 3:
				anularBajaLibro(libros, bajas);
				break;
			case 4:
				actualizarLibro(libros, materias, bajas);
				break;
			case 5:
				listarLibros(libros);
				break;
			case 6:
				compactarRegistro(libros, bajas);
				break;
			case 7:
				GestionMaterias.mostrarMenuMaterias(materias, libros);
				break;
			case 8:
				salirMenuLibros();
				break;
			default:
				System.out.println("\nSelección inválida");
			}

		} while (seleccion != 8);
	}

	// Funcion que permite introducir los datos de un libro en el sistema,
	// comprobará si el libro existe ya en el sistema y pedirá una confirmación
	public static void altaLibro(ArrayList<Libro> libros, ArrayList<Materia> materias, ArrayList<Baja> bajas) {
		Libro l = new Libro();
		Baja b = new Baja();
		l.leerDatos(materias);

		// Comprobación de si el libro ya está en el sistema
		if (!libros.contains(l)) {
			// Impresión del libro
			System.out.println(l.mostrarDatos());
			System.out.println("\nEl libro se añadirá al sistema");

			// Solicitación de la validación
			if (Validacion.validarRespuesta()) {

				System.out.println("\nEl libro se ha añadido al sistema");

				libros.add(l);
				
				b.setCantBajas(b.getCantBajas() + 1);
				
				b.setCodLibro(libros.indexOf(l));

				Validacion.solicitarIntro();
			}
		} else {
			System.out.println("\nEl libro ya está en el sistema");
		}
	}

	// Función que marcará el libro seleccionado de entre los que se encuentran en
	// el sistema como de baja, reduciendo su cantidad en uno
	public static void bajaLibro(ArrayList<Libro> libros, ArrayList<Baja> bajas) {
		int libro;

		for (int i = 0; i < libros.size(); i++) {
			System.out.println(i);
			System.out.println(libros.get(i).mostrarDatos());
		}

		System.out.println("\nEscoja el libro a dar de baja");

		// Para evitar error por introducir un número que exceda o no llegue al tamaño
		// del arralist
		do {

			libro = Validacion.leerNum();

		} while ((libro < libros.size() - 1) && (libro > 0));

		if (Validacion.validarRespuesta()) {
			System.out.println("\nEl libro se marcará como baja en el sistema");
			
			bajas.get(libros.indexOf(libro)).setCantBajas(bajas.get(libros.indexOf(libro)).getCantBajas() + 1);

			libros.get(libro).setCantEjemplares(libros.get(libro).getCantEjemplares() - 1);
		}
	}

	// Función que nos permitirá anular la baja en un libro, aumentando en uno su
	// cantidad
	public static void anularBajaLibro(ArrayList<Libro> libros, ArrayList<Baja> bajas) {
		int libro, n;

		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i).mostrarDatos());
			System.out.println(i);
		}

		System.out.println("\nEscoja el libro al cual anular la baja");

		do {

			libro = Validacion.leerNum();

		} while ((libro < libros.size() - 1) && (libro > 0));

		if (Validacion.validarRespuesta()) {
			System.out.println("\nLa baja del libro se anulará en el sistema");
			
			bajas.get(libros.indexOf(libro)).setCantBajas(bajas.get(libros.indexOf(libro)).getCantBajas() - 1);

			libros.get(libro).setCantEjemplares(libros.get(libro).getCantEjemplares() + 1);
		}
	}

	public static void actualizarLibro(ArrayList<Libro> libros, ArrayList<Materia> materias, ArrayList<Baja> bajas) {
		int libro;

		// Mostrar todos los libros en el sistema
		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i).mostrarDatos());
			System.out.println(i);
		}

		// Selección del libro a actualizar
		libro = Validacion.leerInt("\nSeleccione el libro a actualizar");

		// Comprobación de la existencia o estado de baja del libro, en cuyo caso se
		// muestra un aviso
		if ((libros.get(libro) != null) || (libros.get(libro).getCantEjemplares() == 0)) {
			System.out.println("\nEl libro no se encuentra en el sistema o no se encuentran ejemplares sin dar de baja");

			Validacion.solicitarIntro();

		} else {

			// Finalización de la funcion actualizando los datos del libro y pidiendo una
			// validación
			libros.get(libro).leerDatos(materias);

			libros.get(libro).mostrarDatos();

			Validacion.validarRespuesta();
		}
	}

	public static void listarLibros(ArrayList<Libro> libros) {
		// Muestro todos los libros registrados si existe alguno, si no existiesen
		// muestro aviso por pantalla, solicito intro y envío de vuelta a menu 1.2
		if (libros.isEmpty()) {
			
			System.out.println("\nNo hay libros registrados");

			Validacion.solicitarIntro();

		} else {

			for (int i = 0; i < libros.size(); i++) {
				libros.get(i).mostrarDatos();

				System.out.println("\nFin de la lista de libros");

				Validacion.solicitarIntro();
			}
		}
	}

	public static void compactarRegistro(ArrayList<Libro> libros, ArrayList<Baja> bajas) {
		// Compruebo si hay libros antes de comenzar, envió aviso de error y devuelvo al
		// menu 1.2 y si hay libros en el sistema muestra los libros en baja para luego
		// eliminarlos
		if (libros.isEmpty()) {
			System.out.println("\nNo hay libros registrados");

			Validacion.solicitarIntro();

		} else {
			
			for (int i = 0; i < bajas.size(); i++) {
				if (bajas.get(i).getCantBajas() > 1) {
					bajas.get(i).setCantBajas(0);
					
					System.out.println("\nFin del compactamiento del registro de libros");

					Validacion.solicitarIntro();
				}
			}
		}
	}

	public static void salirMenuLibros() {
		System.out.println("\nHa abandonado el menú de gestión de libros");

		Validacion.solicitarIntro();
	}
}
