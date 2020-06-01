package FigurasGeometricas;

public class Cuadrado extends Figura{

	float base, altura;
	
	public float calcularArea() {
		
		this.area = this.base * this.altura;
		return this.area;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	
	
}

