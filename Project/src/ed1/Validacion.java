package ed1;

import java.util.Scanner;

public class Validacion 
{
	static boolean continuar;
	
	public static void validarOpcion(int seleccion)
	{
		if ((seleccion < 1) || (seleccion > 9))
		{
			System.out.println("\nError: selección mal introducida");
		}
	}
		 
	public static boolean validarSuma(float n1, float n2)
	{
		continuar = validarConfirmacion("suma");
		
		return continuar;
	}
	
	public static boolean validarResta(float n1, float n2)
	{
		continuar = validarConfirmacion("resta");
		
		return continuar;
	}
	
	public static boolean validarMultiplicacion(float n1, float n2)
	{
		continuar = validarConfirmacion("multiplicación");
		
		return continuar;
	}
	
	public static boolean validacionDivision(float n1, float n2)
	{
		
		if (validarNumero(n1) && validarNumero(n2) && (n1 != 0) && (n2 != 0))
		{
			continuar = validarConfirmacion("división");
		}
		else 
		{
			if (n1 == 0)
			{
				System.out.println("El operador " + n1 + " no es válido para esta operación");
			}
			
			if (n2 == 0)
			{
				System.out.println("El operador " + n2 + " no es válido para esta operación");
			}
		}
		
		
		return continuar;
	}
	
	public static boolean validarPotencia(float n1, float n2)
	{
		
		if (validarNumero(n1) && validarNumero(n2))
		{
			if (((n1 < 0) && (n2 >= 0)) || (n1 >= 0))
			{
				continuar = validarConfirmacion("potencia");
			}
			else
			{
				if ((n1 < 0) && (n2 < 0))
				{
					System.out.println("Cuando la base es negativa no se admiten exponentes negativos");
				}
			}
		}
		
		return continuar;
    }

	public static boolean validarMaximo(float n1, float n2)
	{
		if (validarNumero(n1) && validarNumero(n2))
		{
			continuar = validarConfirmacion("máximo");
		}
		
		return continuar;
	}

	public static boolean validarMinimo(float n1, float n2)
	{
		if (validarNumero(n1) && validarNumero(n2))
		{
			validarConfirmacion("mínimo");
		}
		
		return continuar;
	}

	public static boolean validarRaiz(float n1, float n2)
	{
		
		if (validarNumero(n1) && validarNumero(n2))
		{
			if (n1 >= 1) 
			{
				continuar = validarConfirmacion("raíz");
			}
			else
			{
				if (n1 < 0)
				{
					if ((n2 % 2 == 0) && (n2 % 10 == 0) && (n2 > 0))
					{
						continuar = validarConfirmacion("raíz");
					}
					else
					{
						System.out.println("Cuando el es negativa no se admiten índices negativos");
					}
				}
				else 
				{
					if (n1 == 0)
					{
						System.out.println("No se puede realizar la raíz");
					}
				}
			}
		}
		return continuar;
	}

	public static boolean validarConfirmacion(String operacion)
	{
		Scanner sc = new Scanner(System.in);
		String confirmacion = " ";
		boolean continuar = false;
		
		System.out.println("\nOperación a realizar: " + operacion);
		System.out.println("\nAceptar/Cancelar");
		confirmacion = sc.nextLine();
		
		if (confirmacion.equalsIgnoreCase("Aceptar"))
		{
			continuar = true;
		}
		else
		{
			if (confirmacion.equalsIgnoreCase("Cancelar"))
			{
				continuar = false;
			}
		}
		return continuar;
	}
	
	//Regex para validar el número introducido
	public static boolean validarNumero(float n)
	{
		boolean valido = false;
		String num = Float.toString(n);
		
		if (num.matches("^[+-]?[0-9]{1,9}(?:.[0-9]{1,2})?$"))
		{
			valido = true;
		}
		
		return valido;
	}
}
