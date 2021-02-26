package appBanco;

import java.util.ArrayList;

public class Libro 
{
	private static String autor;
	private static String titulo;
	private static String materia;
	private static int cantEjemplares;
	private static int codLibro;
	private static boolean prestamo;
	private static ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public Libro (String autor, String titulo, String materia, int cantEjemplares, int codLibro)
	{
		this.autor = autor;
		this.titulo = titulo;
		this.materia = materia;
		this.cantEjemplares = cantEjemplares;
		this.codLibro = codLibro;
	}
	
	public Libro ()
	{
		this(" ", " ", " ", 0, 0);
	}
	
	public crearCodigo
	
}
