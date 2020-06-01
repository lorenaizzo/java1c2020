package clase05.prg;

public class Casa {
	
	//Atributos
	int area;
	Puerta puerta;
	
	
	
	
	//Metodos
	public Casa(int area) {
		super();
		this.area = area;

	}


	public Puerta getPuerta() {
		return puerta;
	}


	public void setPuerta(Puerta puerta) {
		this.puerta = puerta;
	}
	
	
	public void showData() {
		System.out.println("Soy una casa, mi area es de " + this.area + " m2");
		
		
	}
	

}
