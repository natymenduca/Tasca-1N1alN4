package s101_n2Ex1_TELEFONO.java;

public class Smartphone extends Telefono implements Camara,Reloj { 
    
    public Smartphone(String marca, String modelo) {
		super(marca, modelo);
		
	}
	public void fotografiar() { 
		System.out.println("Se esta haciendo una foto");
	}
	public void alarma() {
		System.out.println("Esta sonando la alarma");
	}
}






