package biblioteca;

public class Baja {
	private int codLibro;
	private int cantBajas;
	
	public Baja(int codLibro, int cantBajas) {
		this.codLibro = codLibro;
		this.cantBajas = cantBajas;
	}
	
	public Baja() {
		this (0,0);
	}

	public int getCodLibro() {
		return codLibro;
	}

	public void setCodLibro(int codLibro) {
		this.codLibro = codLibro;
	}

	public int getCantBajas() {
		return cantBajas;
	}

	public void setCantBajas(int cantBajas) {
		this.cantBajas = cantBajas;
	}
	
	
	

}
