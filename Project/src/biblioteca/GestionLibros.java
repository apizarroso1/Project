package biblioteca;

import java.util.ArrayList;

public class GestionLibros {
	
	//Menu para la gesti�n de libros
	public static void mostrarMenuLibros(ArrayList<Libro> libros, ArrayList<Materia> materias) {
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
				altaLibro(libros, materias);
				break;
			case 2:
				bajaLibro(libros);
				break;
			case 3:
				anularBajaLibro(libros);
				break;
			case 4:
				actualizarLibro(libros, materias);
				break;
			case 5:
				listarLibros(libros);
				break;
			case 6:
				compactarRegistro(libros);
				break;
			case 7:
				GestionMaterias.mostrarMenuMaterias(materias, libros);
				break;
			case 8:
				salirMenuLibros();
				break;
			default:
				System.out.println("\nSelecci�n inv�lida");
			}

		} while (seleccion != 8);
	}

	// Funcion que permite introducir los datos de un libro en el sistema,
	// comprobar� si el libro existe ya en el sistema y pedir� una confirmaci�n
	public static void altaLibro(ArrayList<Libro> libros, ArrayList<Materia> materias) {
		Libro l = new Libro();
		l.leerDatos(materias);

		// Comprobaci�n de si el libro ya est� en el sistema
		if (libros.contains(l)) {
			System.out.println("\nEl libro ya est� en el sistema");
		} else {
			// Impresi�n del libro
			System.out.println(l.mostrarLibro());
			System.out.println("\nEl libro se a�adir� al sistema");

			// Solicitaci�n de la validaci�n
			if (Validacion.validarRespuesta()) {
				libros.add(l);
			}
		}
	}

	// Funci�n que marcar� el libro seleccionado de entre los que se encuentran en
	// el sistema como de baja, reduciendo su cantidad en uno
	public static void bajaLibro(ArrayList<Libro> libros) {
		int libro, n;

		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i).mostrarLibro());
			System.out.println(i);
		}

		System.out.println("\nEscoja el libro a dar de baja");

		// Para evitar error por introducir un n�mero que exceda o no llegue al tama�o
		// del arralist
		do {

			libro = Validacion.leerNum();

		} while ((libro < libros.size() - 1) && (libro > 0));

		if (Validacion.validarRespuesta()) {
			System.out.println("\nEl libro se marcar� como baja en el sistema");
			libros.get(libro).setBaja(true);

			n = libros.get(libro).getCantEjemplares();
			n--;
			libros.get(libro).setCantEjemplares(n);
		}
	}

	// Funci�n que nos permitir� anular la baja en un libro, aumentando en uno su
	// cantidad
	public static void anularBajaLibro(ArrayList<Libro> libros) {
		int libro, n;

		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i).mostrarLibro());
			System.out.println(i);
		}

		System.out.println("\nEscoja el libro al cual anular la baja");

		do {

			libro = Validacion.leerNum();

		} while ((libro < libros.size() - 1) && (libro > 0));

		if (Validacion.validarRespuesta()) {
			System.out.println("\nLa baja del libro se anular� en el sistema");
			libros.get(libro).setBaja(false);

			n = libros.get(libro).getCantEjemplares();
			n++;
			libros.get(libro).setCantEjemplares(n);
		}
	}

	public static void actualizarLibro(ArrayList<Libro> libros, ArrayList<Materia> materias) {
		int libro;

		// Mostrar todos los libros en el sistema
		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i).mostrarLibro());
			System.out.println(i);
		}

		// Selecci�n del libro a actualizar
		System.out.println("\nEscoja el libro a actualizar");
		libro = Validacion.leerNum();

		// Comprobaci�n de la existencia o estado de baja del libro, en cuyo caso se
		// muestra un aviso
		if ((libros.get(libro) != null) || (libros.get(libro).isBaja())) {
			System.out.println("\nEl libro no se encuentra en el sistema o se encuentra de baja");

			Validacion.solicitarIntro();

		} else {

			// Finalizaci�n de la funcion actualizando los datos del libro y pidiendo una
			// validaci�n
			libros.get(libro).leerDatos(materias);

			libros.get(libro).mostrarLibro();

			Validacion.validarRespuesta();
		}
	}

	public static void listarLibros(ArrayList<Libro> libros) {
		// Muestro todos los libros registrados si existe alguno, si no existiesen
		// muestro aviso por pantalla, solicito intro y env�o de vuelta a menu 1.2
		if (libros.isEmpty()) {
			System.out.println("\nNo hay libros registrados");

			Validacion.solicitarIntro();

		} else {

			for (int i = 0; i < libros.size(); i++) {
				libros.get(i).mostrarLibro();

				System.out.println("\nFin de la lista de libros");

				Validacion.solicitarIntro();
			}
		}
	}

	public static void compactarRegistro(ArrayList<Libro> libros) {
		// Compruebo si hay libros antes de comenzar, envi� aviso de error y devuelvo al
		// menu 1.2 y si hay libros en el sistema muestra los libros en baja para luego
		// eliminarlos
		if (libros.isEmpty()) {
			System.out.println("\nNo hay libros registrados");

			Validacion.solicitarIntro();

		} else {

			for (int i = 0; i < libros.size(); i++) {
				if (libros.get(i).isBaja()) {
					libros.get(i).mostrarLibro();
					libros.remove(i);
					System.out.println("\nFin del compactamiento del registro de libros");

					Validacion.solicitarIntro();
				}
			}
		}
	}

	public static void salirMenuLibros() {
		System.out.println("\nHa abandonado el men� de gesti�n de libros");

		Validacion.solicitarIntro();
	}
}
