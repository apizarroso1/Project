package biblioteca;

import java.util.Scanner;

public class Lector 
{
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private String domicilio;
	private String telefono;
	private String codLector;
	
	public Lector(String nombre, String apellido1, String apellido2, String dni, String domicilio, String telefono, String codLector)
	{
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.codLector = codLector;
	}
	
	public Lector()
	{
		this(" ", " ", " ", "1", " ", "111111111", "1");
	}
	
	public Lector(String dni)
	{
		this.dni = leerDni();
	}

	public String leerDni() 
	{
		Scanner sc = new Scanner(System.in);
		String dni;
		
		do
		{
			
			System.out.println("\nIntroduzca el dni del lector");
			dni = sc.nextLine();
			
		}while (dni.equals(" "));
		
		return dni;
	}
	
	public void leerDatos()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nIntroduzca el nombre del lector");
		
		this.nombre = sc.nextLine();
		
		System.out.println("\nIntroduzca el primer apellido del lector");
		
		this.apellido1 = sc.nextLine();
		
		System.out.println("\nIntroduzca el segundo apellido del lector");
		
		this.apellido2 = sc.nextLine();
		
		this.dni = leerDni();
		
		System.out.println("\nIntroduzca el domicilio del lector");
		
		this.domicilio = sc.nextLine();
		
		System.out.println("\nIntroduzca el teléfono del lector");
		
		this.telefono = sc.nextLine();
		
		System.out.println("\nIntroduzca el código del lector");
		
		this.codLector = sc.nextLine();
		
	}
}
