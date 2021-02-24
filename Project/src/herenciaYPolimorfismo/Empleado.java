package herenciaYPolimorfismo;

import daw.com.Teclado;

public class Empleado 
{
	private String nombre;
	private int antiguedad;
	private String dni;
	
	public Empleado()
	{
		this (" ", 0, "11111111A");
	}
	
	public Empleado(String nombre, int antiguedad, String dni) 
	{
		this.nombre = Teclado.leerString("Introduzca el nombre del empleado");
		this.antiguedad = Teclado.leerInt("Introduzca la antigüedad del empleado");
		this.dni = leerDni();
	}
	
	public Empleado (String nombre, int antiguedad)
	{
		this (nombre, antiguedad, leerDni());
	}

	public static String leerDni() 
	{
		String dni = Teclado.leerString("Introduzca el dni del empleado");
		if (dni.equals(dni));
		return dni;
	}

	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public int getAntiguedad() 
	{
		return antiguedad;
	}
	
	public void setAntiguedad(int antiguedad) 
	{
		if (antiguedad < 0)
		{
			antiguedad = 0;
		}
		this.antiguedad = antiguedad;
	}
	
	public String getDni() 
	{
		return dni;
	}
	
	public void setDni(String dni) 
	{
		this.dni = dni;
	}
	
	public void leerDatos ()
	{
		nombre = Teclado.leerString("\nNombre");
		dni = leerDni();
		antiguedad = Teclado.leerInt("\nAntiguedad");
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		Empleado other = (Empleado) obj;
		return this.dni.equals(other.dni);
	}
}
