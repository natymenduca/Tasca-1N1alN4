package s101_n2Ex1_TELEFONO.java;

public class S101_n2Ex1_TELEFONO {
	
	static {
		System.out.println("Cargando clase");
	}

	public static void main(String[] args) {
		Smartphone smartphone = new Smartphone(null,null);
		smartphone.llamar("123456789");
		smartphone.fotografiar();
		smartphone.alarma();
	}
}



