package n1Ex2;

public class S101_n1Ex2_COCHE {

	public static void main(String[] args) {
		
		Coche coche = new Coche("Ford", "Ka", 100);
		System.out.println("Coche 1: " + Coche.modelo); 
		
		Coche.modelo = "Focus"; 
        System.out.println("Coche 1: " + Coche.modelo); 
		
        Coche.frenar(); 
		
	    coche.acelerar(); 
	}
}



