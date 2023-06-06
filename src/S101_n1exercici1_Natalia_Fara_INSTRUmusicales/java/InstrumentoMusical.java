
package S101_n1exercici1_Natalia_Fara_INSTRUmusicales.java;

public abstract class InstrumentoMusical {
	    
		//atributos
		protected String nombre;
		protected double precio;
	
		//metodo constructor
		public void InstromentoMusical(String nombre, double precio) {
			this.nombre = nombre;
			this.precio = precio;
		}
		//GETTERS
		public String getNombre() {
			return this.getNombre();
		}
		public double getPrecio() {
			return this.getPrecio();
		}
	    abstract void tocar();  //método abstracto tocar() ***Error ya esta Corregido
		
}
		



