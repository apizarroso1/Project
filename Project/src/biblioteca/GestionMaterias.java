package biblioteca;

import java.util.ArrayList;

public class GestionMaterias {

	//Men� para la gesti�n de materias
	public static void mostrarMenuMaterias(ArrayList<Materia> materias, ArrayList<Libro> libros) {
		int seleccion = 0;
		do {
			System.out.println("\n[1] Alta de Materia");
			System.out.println("\n[2] Baja de Materia");
			System.out.println("\n[3] Salir");

			seleccion = Validacion.leerNum();

			switch (seleccion) {
			case 1:
				altaMaterias(materias);
				break;
			case 2:
				bajaMaterias(materias, libros);
				break;
			case 3:
				salirMenuMaterias();
				break;

			default:
				System.out.println("\nSelecci�n inv�lida");
			}

		} while (seleccion != 8);
	}

	// Lee los datos de la materia y comprueba si ya est� en el sistema, si lo est�
	// muestra error y env�a de vuelta al menu 1.3, en el caso de que no estuviese
	// ya registrada la registra tomando las confirmaciones requeridas
	public static void altaMaterias(ArrayList<Materia> materias) {
		Materia materia = null;

		materia.leerDatos();

		if (materias.contains(materia)) {
			System.out.println("\nLa materia ya se encuentra en el sistema");
			Validacion.solicitarIntro();
		} else {

			materia.mostrarMateria();

			if (Validacion.validarRespuesta()) {
				System.out.println("\nMateria a�adida");

				materias.add(materia);

				Validacion.solicitarIntro();
			} else {
				System.out.println("\nHa vuelto al men� de materias");

				Validacion.solicitarIntro();
			}
		}

	}

	// Se muestran todas las materias por pantalla, permite seleccionar la materia a
	// eliminar entre las que se muestras, realiza las confirmaciones necesarias y
	// suprime la referencia a la materia en los libros cuyas materias sean
	// eliminadas
	public static void bajaMaterias(ArrayList<Materia> materias, ArrayList<Libro> libros) {
		int m;
		String materia;
		boolean existe = false, continuar = false;

		for (int i = 0; i < materias.size(); i++) {
			materias.get(i).mostrarMateria();
		}

		System.out.println("\nSeleccione la materia a eliminar");

		do {

			m = Validacion.leerNum();

		} while ((m < materias.size() - 1) && (m > 0));

		materias.get(m).mostrarMateria();

		materia = materias.get(m).getNombre();

		for (int i = 0; i < libros.size() && !existe; i++) {
			if (libros.get(i).getMateria().equalsIgnoreCase(materia)) {
				existe = true;
				System.out.println("\nHay libros que pertenecen a esta materia");

				continuar = Validacion.validarRespuesta();

				if (continuar) {
					materias.remove(m);
					existe = true;
				}
			}
		}

		if (continuar) {
			for (int i = 0; i < libros.size(); i++) {
				if (libros.get(i).getMateria().equalsIgnoreCase(materia)) {
					libros.get(i).setMateria(null);
				}
			}
		}

		if (!existe) {
			if (Validacion.validarRespuesta()) {
				materias.remove(m);

				Validacion.solicitarIntro();
			} else {
				Validacion.solicitarIntro();
			}
		}
	}

	public static void mostrarMaterias(ArrayList<Materia> materias) {
		for (int i = 0; i < materias.size(); i++) {
			materias.get(i).mostrarMateria();
		}
	}

	public static void salirMenuMaterias() {
		System.out.println("\nHa abandonado el men� de gesti�n de libros");

		Validacion.solicitarIntro();
	}

}