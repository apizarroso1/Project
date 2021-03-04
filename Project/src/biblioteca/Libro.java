package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro {

	// Atributos de la clase libro, necesarios para la creacion del objeto Libro
	private String autor;
	private String titulo;
	private String materia;
	private int cantEjemplares;

	// Constructor mediante parametros
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

	// Metodos getters y setters
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

	// Funcion para recibir datos de teclado
	public void leerDatos(ArrayList<Materia> materias) {
		Scanner sc = new Scanner(System.in);

		if (leerMateria(materias)) {
			this.autor = Validacion.leerString("\nAutor");

			this.titulo = Validacion.leerString("\nTitulo");

			this.cantEjemplares = Validacion.leerInt("\nCantidad de ejemplares");
		} else {
			System.out.println("\nEl libro no se ha podido registrar");
			Validacion.solicitarIntro();
		}

	}

	// Compruebo que la materia a la que se asigna el libro se encuentra dentro del
	// arraylist de materias, en caso de que no, no permite registrar el libro
	public boolean leerMateria(ArrayList<Materia> materias) {
		
		Scanner sc = new Scanner(System.in);
		boolean exito = false;
		String nombre;
		Materia materia = new Materia();

		GestionMaterias.mostrarMaterias(materias);

		System.out.println("\nMateria");
		nombre = sc.nextLine();

		materia.setNombre(nombre);

		if (materias.contains(materia)) {

			this.materia = materia.getNombre();

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
