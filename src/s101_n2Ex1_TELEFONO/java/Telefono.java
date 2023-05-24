package s101_n2Ex1_TELEFONO.java;

public class Telefono {
	//atributos
	private String marca ;
	private String modelo;

	//constructor
	public Telefono(String marca, String modelo) {
		this.setMarca(marca);
		this.setModelo(modelo);
	}
	//getters
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	//setters
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void llamar(String numTelf) { 
		System.out.println("Esta llamando al numero " + numTelf); 
	}
    interface  Camara { 
		void fotografiar();
    }
	interface Reloj {
		void alarma();
	}

}



