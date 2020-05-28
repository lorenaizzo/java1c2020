
public class Persona {

	//Atributos
	String nombre;
	String apellido;
	int edad;
	String dni;
	String direccion;
	int mesa;
	
	
	
	//Metodos

	
	// Generales / normales/ creados por el programador
	//int Nombre(par1, par2)
	public boolean voto(boolean votoRealizado) {
		
		
		
		//lo que tiene que hacer
		return votoRealizado;
	} 
	
	
	
	// Metodos especiales => setter y los getters

	
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


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getMesa() {
		return mesa;
	}


	public void setMesa(int mesa) {
		this.mesa = mesa;
	}


	public String mostrarAntecedentes() {
		//codigo
		return "";
	}
	
}
