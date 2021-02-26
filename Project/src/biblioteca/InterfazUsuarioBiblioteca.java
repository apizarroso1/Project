package biblioteca;

import java.util.Scanner;

import ed1.Operaciones;

public class InterfazUsuarioBiblioteca 
{
	public static void mostrarMenu()
	{
		int seleccion = 0;
		do
		{
			System.out.println("\n[1] Gestión de libros");
			System.out.println("\n[2] Gestión de lectores");
			System.out.println("\n[3] Gestión de préstamos");
			System.out.println("\n[4] Búsquedas");
			System.out.println("\n[5] Salir");
			
			seleccion = leerOpcion();
			
			switch (seleccion)
			{
			case 1: mostrarMenuLibros();
			break;
			case 2: mostrarMenuLectores();
			break;
			case 3: mostrarMenuPrestamos();
			break;
			case 4: mostrarMenuBusquedas();
			break;
			case 5: mostrarFin();
			break;
			default: System.out.println("\nSelección inválida");
			}
			
		} while (seleccion != 5);

	}
	
	public static void mostrarMenuBusquedas() 
	{
		
	}

	public static void mostrarMenuPrestamos() 
	{
		
	}

	public static void mostrarMenuLectores() 
	{
			
	}

	public static void mostrarMenuLibros() 
	{
		int seleccion = 0;
		do
		{
			System.out.println("\n[1] Alta de libro");
			System.out.println("\n[2] Baja de libro");
			System.out.println("\n[3] Anular baja de libro");
			System.out.println("\n[4] Actualizar libro");
			System.out.println("\n[5] Listar libros");
			System.out.println("\n[6] Compactar registro de libros");
			System.out.println("\n[7] Actualizar lista de materias");
			System.out.println("\n[8] Salir");
			
			seleccion = leerOpcion();
			
			switch (seleccion)
			{
			case 1: Libro.altaLibro();
			break;
			case 2: Operaciones.restar();
			break;
			case 3: Operaciones.multiplicar();
			break;
			case 4: Operaciones.dividir();
			break;
			case 5: mostrarFin();
			break;
			case 6: mostrarFin();
			break;
			case 7: mostrarFin();
			break;
			case 8: mostrarMenu();
			break;
			default: System.out.println("\nSelección inválida");
			}
			
		} while (seleccion != 5);
	}

	public static int leerOpcion()
	{
		Scanner sc = new Scanner(System.in);
		
		int seleccion = sc.nextInt();
			
		return seleccion;
	}
	
	public static void mostrarInicio ()
	{
		System.out.println("--------------------------------");
		System.out.println("\nINICIO DEL PROGRAMA BIBLIOTECA");
		System.out.println("\n--------------------------------");
	}
	
	public static void mostrarFin ()
	{
		System.out.println("\n--------------------------------");
		System.out.println("\nFIN DEL PROGRAMA BIBLIOTECA");
		System.out.println("\n--------------------------------");
		Scanner sc = new Scanner(System.in);
		sc.close();
	}
}
