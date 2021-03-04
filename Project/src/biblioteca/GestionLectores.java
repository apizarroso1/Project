package biblioteca;

import java.util.ArrayList;

public class GestionLectores {
	public static void mostrarMenuLectores(ArrayList<Lector> lectores) {
		int seleccion = 0;
		do {
			System.out.println("\n[1] Alta de Lector");
			System.out.println("\n[2] Baja de Lector");
			System.out.println("\n[3] Anular baja de Lector");
			System.out.println("\n[4] Actualizar Lector");
			System.out.println("\n[5] Listar Lectores");
			System.out.println("\n[6] Compactar registro de Lectores");
			System.out.println("\n[7] Buscar Lector");
			System.out.println("\n[8] Salir");

			seleccion = Validacion.leerNum();

			switch (seleccion) {
			case 1:
				altaLectores(lectores);
				break;
			case 2:
				bajaLectores(lectores);
				break;
			case 3:
				anularBajaLectores(lectores);
				break;
			case 4:
				actualizarLector(lectores);
				break;
			case 5:
				listarLectores(lectores);
				break;
			case 6:
				compactarLectores(lectores);
				break;
			case 7:
				buscarLector(lectores);
				break;
			case 8:
				salirMenuLectores();
				break;
			default:
				System.out.println("\nSeleccion invalida");
			}

		} while (seleccion != 8);
	}

	public static void altaLectores(ArrayList<Lector> lectores) {
		Lector l = new Lector();
		boolean continuar = false;

		l.leerDatos();

		if (!lectores.contains(l)) {

			l.mostrarDatos();

			System.out.println("\nEl lector se aniadira al sistema");

			continuar = Validacion.validarRespuesta();

			if (continuar) {
				System.out.println("\nEl lector se ha aniadido al sistema");

				lectores.add(l);

				Validacion.solicitarIntro();
			}
		} else {
			System.out.println("\nEl lector ya se encuentra en la base de datos");
		}
	}

	public static void bajaLectores(ArrayList<Lector> lectores) {
		int lector = 0;
		boolean continuar = false;

		for (int i = 0; i < lectores.size(); i++) {
			System.out.println(i);
			lectores.get(i).mostrarDatos();
		}

		lector = Validacion.leerInt("\nSeleccione el lector a dar de baja");

		continuar = Validacion.validarRespuesta();

		if (continuar) {
			if (lectores.contains(lectores.get(lector)) || lectores.get(lector).isBaja()) {

				System.out.println("\nEl lector se ha marcado como baja");
				lectores.get(lector).setBaja(true);

				Validacion.solicitarIntro();
			} else {
				System.out.println("\nEl lector no se encuentra en la base de datos o ya se encuentra dado de baja");
			}
		} else {
			System.out.println("\nVolviendo al menu de gestion de lectores");
		}
	}

	public static void anularBajaLectores(ArrayList<Lector> lectores) {
		int lector = 0;
		boolean continuar = false;

		for (int i = 0; i < lectores.size(); i++) {
			lectores.get(i).mostrarDatos();
		}

		lector = Validacion.leerInt("\nSeleccione el lector al que anular la baja");

		if (lectores.get(lector).isBaja()) {

			lectores.get(lector).mostrarDatos();

			continuar = Validacion.validarRespuesta();

			if (continuar) {
				lectores.get(lector).setBaja(false);

				System.out.println("\nLa marca de baja se ha suprimido en el lector");

				System.out.println("\nVolviendo al menu de gestion de lectores");

				Validacion.solicitarIntro();
			} else {

				System.out.println("\nVolviendo al menu de gestion de lectores");

				Validacion.solicitarIntro();
			}
		} else {

			System.out.println("\nEl lector no esta de baja");

			System.out.println("\nVolviendo al menu de gestion de lectores");

			Validacion.solicitarIntro();
		}

	}

	public static void actualizarLector(ArrayList<Lector> lectores) {
		int lector = 0;
		boolean continuar = false;

		for (int i = 0; i < lectores.size(); i++) {
			lectores.get(i).mostrarDatos();
		}

		lector = Validacion.leerInt("\nSeleccione el lector cuya informacion esta para actualizar");

		if (lector >= 0 || lector <= lectores.size()) {
			lectores.get(lector).mostrarDatos();

			continuar = Validacion.validarRespuesta();

			if (continuar) {
				lectores.get(lector).leerDatos();

				System.out.println("\nDatos de lector actualizados");

				System.out.println("\nVolviendo al menu de gestion de lectores");

				Validacion.solicitarIntro();

			} else {

				System.out.println("\nVolviendo al menu de gestion de lectores");

				Validacion.solicitarIntro();
			}
		} else {
			System.out.println("\nEl lector no se encuentra en el sistema");

			System.out.println("\nVolviendo al menu de gestion de lectores");

			Validacion.solicitarIntro();
		}
	}

	public static void listarLectores(ArrayList<Lector> lectores) {
		for (int i = 0; i < lectores.size(); i++) {
			System.out.println("\n" + i);
			lectores.get(i).mostrarDatos();
		}
		System.out.println("\nFin del listado de lectores");
		Validacion.solicitarIntro();
	}

	public static void compactarLectores(ArrayList<Lector> lectores) {
		for (int i = 0; i < lectores.size(); i++) {

			if (lectores.get(i).isBaja()) {
				lectores.remove(i);
			}
		}

		System.out.println("\nFin de la compactación del sistema de lectores");
	}

	public static void buscarLector(ArrayList<Lector> lectores) {
		String nombre = " ";
		String apellido = " ";

		nombre = Validacion.leerString("\nIntroduzca el nombre a buscar");
		apellido = Validacion.leerString("\nIntroduzca el apellido a buscar");

		for (int i = 0; i < lectores.size(); i++) {
			if (lectores.get(i).getNombre().equalsIgnoreCase(nombre)
					|| lectores.get(i).getApellidos().equalsIgnoreCase(apellido)) {
				lectores.get(i).mostrarDatos();
			}
		}
	}
	
	public static void salirMenuLectores() {
		System.out.println("\nHa abandonado el menu de gestion de lectores");
	}

}
