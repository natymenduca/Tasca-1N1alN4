package s101_n3Ex1_REDACTOR.java;

public class S101_n3Ex1_REDACTOR {

	public static void main(String[] args) {
		Redactor redactor1 = new Redactor("Juan", "12345678A");
	    Redactor redactor2 = new Redactor("María", "87654321B");
	    
	    NoticiaFutbol noticia1 = new NoticiaFutbol("El Barça pierde la Liga");
	    noticia1.setCompeticion("Liga");
	    noticia1.setClub("Barça");
	    noticia1.setJugador("Messi");
	    redactor1.introducirNoticia(noticia1);
	    
	    NoticiaFutbol noticia2 = new NoticiaFutbol("El Madrid gana la Liga de Campeones");
	    noticia2.setCompeticion("Liga de Campeones");
	    noticia2.setClub("Madrid");
	    noticia2.setJugador("Benzema");
	    redactor2.introducirNoticia(noticia2);
	    
	    redactor1.mostrarNoticias(); // muestra la noticia1
	    redactor2.mostrarNoticias(); // muestra la noticia2
	    
	    redactor1.eliminarNoticia("El Madrid gana la Liga");
	    
	    redactor1.mostrarNoticias(); // no muestra ninguna noticia
	}
		
}


