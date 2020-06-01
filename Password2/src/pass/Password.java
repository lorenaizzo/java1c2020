package pass;

import java.util.*;

public class Password {

	int longitud;
	String password;
	
	
	public String getPassword() {
		return password;
	}


	public Password() {
		super();
		this.longitud = 8;
	}
	
	
	public Password(int longitud) {
		
		if(longitud < 6) {
			this.longitud = 8;
		}
		else {
			this.longitud = longitud;
		}
	}
		
	
	private Boolean esFuerte(String clave) {
		char letra;
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		
		
		for(int i = 0; i < clave.length(); i++) {
			letra = clave.charAt(i);
			
			if(Character.isUpperCase(letra)) {
				mayusculas += 1;
			}
			
			if(Character.isLowerCase(letra)) {
				minusculas += 1;
			}
			
			if(Character.isDigit(letra)) {
				numeros += 1;
			}			
			
		}
		
		if(mayusculas >= 2 && minusculas >= 1 && numeros > 3) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	
	
	public String generarPassword() {
		Random ran = new Random();
		String clave = "";
		char caracter;
		

		while(!esFuerte(clave)) {
			clave = "";
			
			for(int i = 0; i < this.longitud; i ++) {
				
				caracter = (char)(ran.nextInt(94)+33);
				
				clave += caracter;
			}
		}
		this.password = clave;
		
		return this.password;
		
	
		
		
	}
	
	
	
	
}
