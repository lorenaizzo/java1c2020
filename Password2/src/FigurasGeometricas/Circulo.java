package FigurasGeometricas;

public class Circulo extends Figura{

	float radio;
	
	public float calcularArea() {
		
		this.area = (float)Math.PI * radio * radio;
		
		return this.area;
	}
	

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}


	
}
