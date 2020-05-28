
public class Numero {
	
	//Atributos
	int valor;
	
	
	
	//Metodos
	
	public Numero(int numero) {
		super();
		this.valor = numero;
	
	}

	
	

	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}
	
	

	
	//Mis metodos
	
	public boolean mayorQueCien() {
		
		if(this.valor > 100) {
			return true;
		}
		else {
			return false;
		}
		
	}
		
	
	public int cuadrado() {
		
		return this.valor * this.valor;
		
	}
	
	
	
	public float raizCuadrada() {
		
		float numero = (float) Math.sqrt(this.valor);
		
		return numero;
	}

	
	
}
