package ejerciciosProg;
import java.util.ArrayList;
import daw.com.Teclado;
import ejerciciosDeMiguel.Libro;
import daw.com.Pantalla;
public class AppCine {

	public static void main(String[] args) {
		ArrayList <Pelicula> pelis = new ArrayList<Pelicula>();
		String opcion;
		int contador = 0;
		
		do {
			pelis.add(Pelicula());
			opcion = Teclado.leerString("Desea continuar s/n");
		} while (opcion.contentEquals("s"));
		

		do
		{
			p = new Pelicula();
			do 
			{
				p.leerTitulo();
			}while (libros.contains(l));
			l.leerRestoDatos();
			
			libros.add(l);
			
		}while (Teclado.leerString("sigo?(s/n)").equals("s"));

	}
}
