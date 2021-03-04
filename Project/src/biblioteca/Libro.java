package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro {

	// Atributos de la clase libro, necesarios para la creación del objeto Libro
	private String autor;
	private String titulo;
	private String materia;
	private int cantEjemplares;

	// Constructor mediante parámetros
	public Libro(String autor, String titulo, String materia, int cantEjemplares) {
		this.autor = autor;
		this.titulo = titulo;
		this.materia = null;
		this.cantEjemplares = cantEjemplares;
	}

	// Constructor por defecto
	public Libro() {
		this(" ", " ", " ", 0);
	}

	// Métodos getters y setters
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getCantEjemplares() {
		return cantEjemplares;
	}

	public void setCantEjemplares(int cantEjemplares) {
		this.cantEjemplares = cantEjemplares;
	}

	// Función para recibir datos de teclado
	public void leerDatos(ArrayList<Materia> materias) {
		Scanner sc = new Scanner(System.in);

		if (leerMateria(materias)) {
			this.autor = Validacion.leerString("\nAutor");

			this.titulo = Validacion.leerString("\nTitulo");

			this.cantEjemplares = Validacion.leerInt("\nCantidad de ejemplares");

		}

	}

	// Compruebo que la materia a la que se asigna el libro se encuentra dentro del
	// arraylist de materias, en caso de que no, no permite registrar el libro
	public boolean leerMateria(ArrayList<Materia> materias) {
		Scanner sc = new Scanner(System.in);
		boolean exito = false;

		GestionMaterias.mostrarMaterias(materias);

		System.out.println("\nMateria");
		String materia = sc.nextLine();

		if (materias.contains(materia)) {
			this.materia = materia;

			exito = true;

		} else {
			System.out.println("\nLa materia no existe en la lista de materias");

			Validacion.solicitarIntro();
		}

		return exito;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", materia=" + materia + ", cantEjemplares="
				+ cantEjemplares + "]";
	}

	public String mostrarDatos() {
		return "\n" + toString();
	}
}
