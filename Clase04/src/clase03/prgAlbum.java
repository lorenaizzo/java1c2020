package clase03;

import java.util.*;

public class prgAlbum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Objetivo: crear un album
		// que necesito para crear un album? Fotos (16 fotos)
		// que necesito para crear una foto? Al menos 1 persona y como maximo 5
		// que necesito para crear una persona? solo nombre, apellido y una edad
		
		ArrayList<Foto> fotos = new ArrayList<Foto>();
		
		for(int i = 0; i < 16; i++) {
			
			fotos.add(crearFoto());
		}
		
		Album miAlbum = new Album();
		miAlbum.setAlbum(fotos);
		
		
		miAlbum.getAlbum().forEach(unaFoto -> {
			System.out.println(unaFoto.getLugar() + " " + unaFoto.getDescripcion() + " " + unaFoto.getFecha() );
		});
		

		
	}
	
	
	public static Foto crearFoto() {
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		Random ran = new Random();
		int numero = ran.nextInt(5) + 1;

		for(int i=0; i < numero; i++) {
			
			personas.add(crearPersona());
		}		
		
		
		
		Foto unaFoto = new Foto();
		
		unaFoto.setDescripcion("blabla"+numero);
		unaFoto.setFecha("20/02/20");
		unaFoto.setLugar("lalala"+numero);
		unaFoto.setPersonas(personas);

		return unaFoto;
		
		
		
		
	}
	
		
	public static Persona crearPersona() {
		
		Random ran = new Random();
		int numero = ran.nextInt(100);
		
		Persona unaPersona = new Persona("Harry"+numero, "Potter"+numero, numero);
		
		return unaPersona;
		
	}
		
		
		
		
		
		
		
	

}
