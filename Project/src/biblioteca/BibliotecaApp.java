package biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

	public static void main(String[] args) {
		InterfazUsuario.mostrarInicio();

		// Creo el ArrayList que va a contener los libros
		ArrayList<Libro> libros = new ArrayList<Libro>();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		ArrayList<Lector> lectores = new ArrayList<Lector>;

		// Muestro un mensaje de incio sencillo, no conlleva otras acciones
		InterfazUsuario.mostrarInicio();

		// Muestro el men� principal con las opciones para acceder a los submenus o
		// abandonar el programa
		InterfazUsuario.mostrarMenu(libros, materias, lectores);

	}

}
