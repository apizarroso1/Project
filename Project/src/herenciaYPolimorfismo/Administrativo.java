package herenciaYPolimorfismo;

import daw.com.Teclado;

public class Administrativo extends Empleado
{
	private String categoria;
	private String destino;
	private final int SUELDOBASE = 1200;
	
	public Administrativo (String nombre, int antiguedad, String dni, String categoria, String destino)
	{
		super(nombre, antiguedad, dni);
		this.categoria = categoria;
		this.destino = destino;
	}
	
	public Administrativo ()
	{
		this (" ", 0, leerDni(), " ", " ");
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public void leerDatos()
	{
		super.leerDatos();
		categoria = Teclado.leerString("\nCategoría");
		destino = Teclado.leerString("\nDestino");
	}
	
	public int calcularSueldo(int SUELDOBASE, String categoria, int antiguedad)
	{
		int sueldo = SUELDOBASE;
		int bonus = 0;
		int aux = antiguedad;
		int trienio = 0;
		
		if (categoria.equalsIgnoreCase("oficial"))
		{
			bonus = 400;
		}
		
		do
		{
			if (aux % 3 == 0)
			{
				aux = (aux - 3);
				trienio++;
			}
			
		} while (aux > 3);
		
		bonus = bonus + (150 * trienio);
		
		sueldo = (sueldo + bonus);
		
		return sueldo;
	}
}