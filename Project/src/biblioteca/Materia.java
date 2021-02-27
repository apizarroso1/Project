package biblioteca;

import java.util.Scanner;

public class Materia {
	//Atributo de la clase Materia
	private String nombre;
	
	//Constructor por defecto
	public Materia()
	{
		this.nombre = " ";
	}
	
	//Constructor por parámetro
	public Materia (String nombre)
	{
		this.nombre = nombre;
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Función para la lectura del nombre de la materia
	public void leerDatos()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNombre");
		
		this.nombre = sc.nextLine();
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + "]";
	}
	
	//Función para mostrar la materia con salto de línea
	public String mostrarMateria() {
		return "\n" + toString();
	}
	

}
