package biblioteca;

import java.util.ArrayList;

public class GestionLectores 
{
	public static void mostrarMenuMaterias(ArrayList<Lector> lectores, ArrayList<Libro> libros) {
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
}
