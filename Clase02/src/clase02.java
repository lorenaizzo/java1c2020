

import java.util.*;

public class clase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numero;
		Numero misNumeros[] = new Numero[100];
		
		Random ran = new Random();
		
		for(int i = 0; i < 100; i++) {
			numero = ran.nextInt(1000);
			
			misNumeros[i] = new Numero(numero);
			
			System.out.println("El numero es " + misNumeros[i].getValor());
			System.out.println("El cuadrado es " + misNumeros[i].cuadrado());
			
			if(misNumeros[i].mayorQueCien() ==  true) {
				System.out.println("Es MAYOR que 100");
			}
			else {
				System.out.println("Es MENOR que 100");
			}	
			
			System.out.println("La raiz cuadrada es " + misNumeros[i].raizCuadrada());
			System.out.println("-----------------------------------------------------------------------");

			
		}
		
	}
	
}



