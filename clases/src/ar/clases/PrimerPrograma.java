package ar.clases;


import java.util.*;


public class PrimerPrograma {

	public static void main(String[] args) {
		
		// Definicion de variables

		// Primitivas
		int edad = 35;
		double precio = 12.25;
		
		//VECTORES
		
		// Version 1
		int vector1[];
		vector1 =  new int[10];
		
		// Version 2
		int vector2[] = new int[1000];
		
		// Version 3
		int [] vector3 = new int[10];
		
		// Version 4
		int [] vector4;
		vector4 = new int[10];	
		
		
		
		// Objetos
		String nombre = "Pepe";
		String apellido = "Argento";
		
		String [] nombres = new String[50];
		
		
		
		
		
		System.out.println("Hola");
		System.out.println("Mundo");
		
		System.out.println("Hola " + nombre + " " + apellido + " vos tenes " + edad + " anios");
		
		
		
		
		// Condicional (hacer una pregunta)
		if(edad >= 18) {
			//Cuando es verdadera la condicion
			System.out.println("Es mayor de edad");			
			
		}
		else {
			//cuando no se cumple la condicion
			System.out.println("Es menos de edad");
		}
		
		// Condicional compuesto, donde hay mas de una condicion a la vez
		
		// Condicion con "y" => &&  solo entra por verdadero cuando ambos son verdaderos
		if(nombre == "Pepe" && apellido == "Argento") {
			System.out.println("Casados con hijos");
		}
		
		// Condicion con "o" => || entra siempre, solo NO entra cuando ambos son falsos
		if(precio > 10 || precio < 5) {
			System.out.println("No lo compro");
		}
		
		System.out.println(" --------------");

		
		// Recorrer un vector
		for(int i = 0; i < 10; i++) {
			
			vector1[i] = i*2;
			System.out.println(vector1[i]);
			
		}
		
		System.out.println(" --------------");
		
		// Ciclo mientras while
		int j = 0;
		
		while(vector1[j] != 10) {
			j++;		
			
		}
		
		System.out.println("La posicion donde esta el numero 10 es " + (j));
		

	
		System.out.println("-----------------------");
		//Numeros aleatorios
		
		Random ran = new Random();
		
		int otroNumero;
		
		for(int z = 0; z < 1000; z++) {
			
			otroNumero = ran.nextInt(100);
			
			vector2[z] = otroNumero;
			
			System.out.println("posicion " + z + " numero asignado " + vector2[z]);

		}
		
		
		// Mostrar la cantidad de veces que se repite cada numero en el vector2
		int[] repetidos = new int[100];
		
		for(int z = 0; z < 100; z++) {
			repetidos[z] = 0;
			
		}
		
		int posicion;
		
		for(int z = 0; z < 1000; z++) { //z++   => z= z + 1
			posicion = vector2[z];
			
			repetidos[  posicion ] += 1;  // repetidos[posicion] = repetidos[posicion] + 1;
			
		}
		
		System.out.println("-----------------------");

		
		for(int z = 0; z < 100; z++) {
			System.out.println("posicion " + z + " cantidad de veces repetido " + repetidos[z]);
			
		}
		
/*		
		Perro miPerro
			nombre = Balthazar
			sexo = macho
			
			pedirMimos()
			
		Perro miPerra	
			nombre = Luna
			sexo = hembra
			
			pedirMimos()
*/
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		String dato="";
		
		
		System.out.println("Ingresa tu numero");
		dato = teclado.nextLine();
		
		int indice;
		
		indice = Integer.parseInt(dato);
		
		System.out.println("Tu numero se repite: " + repetidos[indice] + " veces");
		
	
	
	}
	
	
	
	

}
