package ejerciciosProg;

public class Cine {

	private float precio;
	private String peli;
	
	//constructor
	public Cine(float precio, String peli) {
		this.precio = precio;
		this.peli = peli;
	}
	
	//setters
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public void setPeli(String peli) {
		this.peli = peli;
	}
	
	//getters
	public float getPrecio() {
		return this.precio;
	}
	
	public String getPeli() {
		return this.peli;
	}
}
