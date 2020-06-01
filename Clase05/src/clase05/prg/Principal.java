package clase05.prg;

public class Principal {

	static public void main(String[] args) {
		
		SmallDepto miDepto = new SmallDepto();
		Puerta puerta = new Puerta();
		
		puerta.setColor("rojo");
		
		miDepto.setPuerta(puerta);
		
		Persona miPersona = new Persona();
		
		miPersona.setNombre("Clark Kent");
		miPersona.setCasa(miDepto);
		
		miPersona.showData();		
		
		
		
		
		
	}
	
}
