package n1Ex2;

public class Coche {
	
	public static final String marca;
	public static String modelo ; 
	public final int potencia; 
	
	static {
	   marca = "Ford";
	   modelo= "Ka";
	}
	//constructor
	public Coche(String marca, String modelo, int potencia) {
		this.potencia = potencia;
	}	
	//metodo generales
	public static void frenar() { 
     System.out.println("El vehiculo esta frenado");
    }
    public void acelerar() { 
    	System.out.println("El vehiculo esta acelerando");
    }
}
