package biblioteca;

public class Lector {
	private String nombre;
	private String apellidos;
	private String dni;
	private String domicilio;
	private String telefono;
	
	public Lector(String nombre, String apellidos, String dni, String domicilio, String telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}
	
	public Lector() {
		this (" ", " ", "1", " ", "111111111");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Lector [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", domicilio=" + domicilio
				+ ", telefono=" + telefono + "]";
	}
	
	public String mostrarDatos() {
		return "\n" + toString();
	}
	

}
