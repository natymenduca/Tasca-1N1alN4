package s101_n3Ex1_REDACTOR.java;

import java.util.ArrayList;

public class Redaccion {
	    //atributo
	    private ArrayList<Redactor> redactores;
	    
	    //constructor
	    public Redaccion() {
	        redactores = new ArrayList<>();
	    }
	    //Introducir redactor
	    public void introducirRedactor(Redactor redactor) {
	        redactores.add(redactor);
	    }
	    //Eliminar redactor
	    public void eliminarRedactor(Redactor redactor) {
	        redactores.remove(redactor);
	    }
	    //Introducir noticia en un redactor
	    public void introducirNoticia(Redactor redactor, Noticia noticia) {
	        redactor.introducirNoticia(noticia);
	    }
	    //Eliminar noticia
	    public void eliminarNoticia(Redactor redactor, String titular) {
	        redactor.eliminarNoticia(titular);
	    }
	    //Mostrar todas las noticias por redactor
	    public void mostrarNoticiasPorRedactor(Redactor redactor) {
	        redactor.mostrarNoticias();
	    }
	   //Calcular puntuación de la noticia
	    public int calcularPuntuacion(Noticia noticia) {
	        return noticia.calcularPuntuacion();
	    }
	     //Calcular precio-noticia
	    public double calcularPrecio;
}
