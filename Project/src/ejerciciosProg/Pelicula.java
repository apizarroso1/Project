package ejerciciosProg;

public class Pelicula {
	
	private String titulo;
	private int duracion;
	private int edadMinima;
	private String director;
	
	//constructor
	public Pelicula(String titulo, int duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}
	
	//getters
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getDuracion() {
		return this.duracion;
	}
	
	public int getEdadMinima() {
		return this.edadMinima;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	//setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}

}
