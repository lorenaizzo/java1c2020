package intro_java;

public class Clase03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adulto papa = new Adulto();
		Adulto mama = new Adulto();
		Ninio hijo = new Ninio();
		
		papa.setApellido("Argento");
		papa.setNombre("Pepe");

		mama.setApellido("Argento");
		mama.setNombre("Moni");
		
		hijo.setApellido("Argento");
		hijo.setNombre("Coky");
		
		Auto miAuto = new Auto("Chevrolet", "Onix", 2020);
		Casa miCasa = new Casa("SiempreViva 123");
		
		papa.setAuto(miAuto);
		papa.setCasa(miCasa);
		
		mama.setCasa(miCasa);
		mama.setAuto(miAuto);
		
		Juguete misJuguetes[] = new Juguete[10];
		
		for(int i = 0; i < 10; i++) {
		
			misJuguetes[i] = new Juguete("tipo"+i);
			
		}
		
		hijo.setJuguetes(misJuguetes);
		
		System.out.println(papa.getNombre());
		System.out.println(mama.getNombre());
		System.out.println(hijo.getNombre());
		
		
		
		Auto autoMostrar = papa.getAuto();
		System.out.println(autoMostrar.getMarca());
		
		System.out.println(papa.getAuto().getMarca());
		
		
		for(int j=0; j < 10; j++) {
			
			Juguete[] juguetes = hijo.getJuguetes();
			Juguete unJuguete = juguetes[j];
			System.out.println(unJuguete.getTipo());
			
			
			System.out.println(hijo.getJuguetes()[j].getTipo());


			System.out.println("--------------------------------");
			
		}
		
		
		
		
	}

}
