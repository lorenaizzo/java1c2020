package ejemplo;

import java.util.Random;

public class ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		
		int numeroRandom = ran.nextInt(100);
		

		String nombre = "Lorena";
		int edad = 43;
		
		System.out.println("HOla " + nombre + " vos tenes " + edad );
		
	    int resultado = Calcular(25, 35);
	    
	    System.out.println(resultado);
	    
	    System.out.println("numero Ran: " + numeroRandom);
		
		
	}




static int Calcular(int a, int b) {
	
	return a + b;
	
	
}



static int Vectores() {
	
	int vectores[];
	vectores = new int [10];
	
	String[] vectorNombre = new String [10];
	
	
	return 0;
	
	
	
	
}

}