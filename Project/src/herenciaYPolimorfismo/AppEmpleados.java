package herenciaYPolimorfismo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import daw.com.Teclado;
import daw.com.Pantalla;

public class AppEmpleados {

	public static void main(String[] args) 
	{
		int tipo;
		int pos;
		int max;
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		do 
		{
			tipo = Teclado.leerInt("1 para administrativo, 2 para profesor y 3 para auxiliar");
			
			
			switch (tipo) 
			{
			case 1:	Administrativo a = new Administrativo();
					a.leerDatos();
					empleados.add(a);
			break;
			
			case 2: Profesor p = new Profesor();
					p.leerDatos();
					empleados.add(p);
			break;
			
			case 3: Auxiliar i = new Auxiliar();
					i.leerDatos();
					empleados.add(i);
			break;
			
			default: Pantalla.escribirString("Error: datos mal introducidos");
			}
			
		} while (Teclado.leerString("\n¿Desea seguir? (s/n)").equals("s"));
		
	}

}
