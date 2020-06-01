package clase05.prg;

public class Persona {
	
	//Atributo
	String nombre;
	Casa casa;
	
	
	//Metodo
	public void showData() {
		System.out.println("Mi nombre es " + this.nombre);
		casa.showData();
		
		casa.getPuerta().showData();
		
		//Puerta miPuerta = casa.getPuerta();
		//miPuerta.showData();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Casa getCasa() {
		return casa;
	}


	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	
	
	

}
