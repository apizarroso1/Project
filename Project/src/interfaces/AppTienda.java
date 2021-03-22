package interfaces;

import daw.com.Pantalla;
import libreria.AppMenu;

public class AppTienda extends AppMenu {
	private Tienda tienda;

	public AppTienda() {
		super();
		addOpcion("[1] Ingresar cliente");
		addOpcion("[2] Ingresar electrodomestico");
		addOpcion("[3] Realizar pedido");
		addOpcion("[4] Mostrar inventario");
		tienda = new Tienda();
	}

	public static void main(String[] args) {
		AppTienda app = new AppTienda();
		app.run();
	}

	@Override
	public void evaluarOpcion(int opcion) {

		switch (opcion) {
		case 1:
			Tienda.ingresarCliente();
			break;
		case 2:
			Tienda.ingresarElectrodomestico();
			break;
		case 3:
			Tienda.realizarPedido();
			break;
		case 4:
			Tienda.mostrarInventario();
			break;
		default:
			Pantalla.escribirString("\nOpcion equivocada");
		}
	}
}
