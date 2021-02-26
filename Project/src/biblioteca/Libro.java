package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import herenciaYPolimorfismo.Empleado;

public class Libro 
{
	private static String autor;
	private static String titulo;
	private static String materia;
	private static int cantEjemplares;
	private static ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public Libro (String autor, String titulo, String materia, int cantEjemplares)
	{
		this.autor = autor;
		this.titulo = titulo;
		this.materia = materia;
		this.cantEjemplares = cantEjemplares;
	}
	
	public Libro ()
	{
		this ( " ", " ", " ", 0);
	}
	
	public void leerDatos()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Autor");
		this.autor = sc.nextLine();
		
		System.out.println("Titulo");
		this.titulo = sc.nextLine();
		
		System.out.println("Materia");
		this.materia = sc.nextLine();
		
		System.out.println("Cantidad");
		this.cantEjemplares = sc.nextInt();
		
	}
	
	public static void altaLibro() 
	{
		Libro l = new Libro();
		l.leerDatos();
		
		if (libros.contains(l))
		{
			System.out.println("El libro ya est� en el sistema");
		}
		else
		{
			libros.add(l);	
		}
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", materia=" + materia + ", cantEjemplares="
				+ cantEjemplares + ", codLibro=" + "]";
	}
	
	public String mostrarLibro()
	{
		return "\n" + this.toString();
	}
}
