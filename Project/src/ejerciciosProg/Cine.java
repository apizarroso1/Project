package ejerciciosProg;

public class Cine {

	private int precio;
	private String peli;
	
	//constructor
	public Cine(int precio, String peli) {
		this.precio = precio;
		this.peli = peli;
	}
	
	//setters
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setPeli(String peli) {
		this.peli = peli;
	}
	
	//getters
	public int getPrecio() {
		return this.precio;
	}
	
	public String getPeli() {
		return this.peli;
	}
}
