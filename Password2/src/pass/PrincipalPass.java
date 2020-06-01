package pass;

public class PrincipalPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Password miClave = new Password();
		Password miClave2 = new Password(5);
		Password miClave3 = new Password(10);
		
		System.out.println(miClave.generarPassword());
		System.out.println(miClave2.generarPassword());
		System.out.println(miClave3.generarPassword());
		
		
		
	}

}
