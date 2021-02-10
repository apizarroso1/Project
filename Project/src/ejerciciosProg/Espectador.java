package ejerciciosProg;

public class Espectador {
	
	private String nombre;
	private int edad;
	private int cartera;
	
	//constructor
	public Espectador(String nombre, int edad, int cartera) {
		this.nombre = nombre;
		this.edad = edad;
		this.cartera = cartera;
	}
	
	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setCartera(int cartera) {
		this.cartera = cartera;
	}
	
	//getters
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public int getCartera() {
		return this.cartera;
	}

}
