package s101_n3Ex1_REDACTOR.java;

public abstract class Noticia { // si se declara un metodo dentro de la clase abstracto la clase para a se abstracta tambien
	    //atributos
	    private String titular;
	    private String texto;
	    private int puntuacion;
	    private double precio;
	    
	    //cosntructor
	    public Noticia(String titular) {
	        this.titular = titular;
	        this.texto = "";
	        this.puntuacion = 0;
	        this.precio = 0;
	    }
	    //getters
	    public String getTitular() {
	        return titular;
	    }
	     public String getTexto() {
	        return texto;
	    }
	    public int getPuntuacion() {
	        return puntuacion;
	    }
	     public double getPrecio() {
	        return precio;
	    }
	    //setters
	    public void setTexto(String texto) {
	        this.texto = texto;
	    }
	    public void setPuntuacion(int puntuacion) {
	        this.puntuacion = puntuacion;
	    }
	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }
	    //metodos generales
	    public abstract int calcularPuntuacion();
	    
	    public abstract double calcularPrecio();
	    //metodo propio
	    public String toString() {
	        return "Titular: " + titular + ", Texto: " + texto + ", Puntuacion: " + puntuacion + ", Precio: " + precio;
	    }
}

