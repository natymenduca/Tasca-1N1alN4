package s101_n3Ex1_REDACTOR.java;

import java.util.ArrayList;

public class Redactor {
	    //atributos
	    private String nombre;
	    private String dni;
	    private double sueldo;
	    
	    private ArrayList<Noticia> noticias;
	    
	    //Constructor
	    public Redactor(String nombre, String dni) {
	        this.nombre = nombre;
	        this.dni = dni;
	        this.sueldo = 1500;
	        noticias = new ArrayList<>();
	    }
	    //getters
	    public String getNombre() {
	        return nombre;
	    }
	    public String getDni() {
	        return dni;
	    }
	    public double getSueldo() {
	        return sueldo;
	    }
	    //metodos generales
	    public void introducirNoticia(Noticia noticia) {
	        noticias.add(noticia);
	    }
	     public void eliminarNoticia(String titular) {
	    	int i; 
	        for (i = 0; i < noticias.size(); i++) {
	            if (noticias.get(i).getTitular().equals(titular)) { //nos pide que getTitular lo declaremso como metodo abstracto de tipo Noticia
	                noticias.remove(i);
	                break;
	            }
	        }
	    }
	    public void mostrarNoticias() {
	        for (Noticia noticia : noticias) {
	            System.out.println(noticia);
	        }
	    }
	    //metodo propio
	     public String toString() {
	        return "Nombre: " + nombre + ", DNI: " + dni + ", Sueldo: " + sueldo;
	    }
}



