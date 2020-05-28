package clase03;

public class Persona {
	//Atributos
	String nombre;
	String apellido;
	int edad;
	String numeroDocumento;
	
	
	//Metodos
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;

	}

	
	public Persona(String numeroDocumento) {
		super();
		this.numeroDocumento = numeroDocumento;
		
		if(numeroDocumento == "202020") {
			this.nombre = "Alberto";
			this.apellido = "Fernandez";
			this.edad = 65;
		}
		
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
