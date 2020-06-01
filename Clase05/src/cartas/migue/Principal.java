package cartas.migue;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cartas mazo[] = new Cartas[40];
		
		Cartas unaCarta = new Cartas();
		
		for(int i=0; i <40; i++) {
			unaCarta.setNumero(i);
			unaCarta.setPalo("basto");
			
			mazo[i] = unaCarta;
			
			
			
			
		}
		
		
		
		
	}

}
