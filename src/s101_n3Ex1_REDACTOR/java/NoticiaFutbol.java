package s101_n3Ex1_REDACTOR.java;

public class NoticiaFutbol extends Noticia { //se extiende a la clase Noticia
	//atributos
		private String competicion;
	    private String club;
	    private String jugador;
	    
	    //metodo constructor
	    public NoticiaFutbol(String titular) {
	        super(titular);
	        this.competicion = "";
	        this.club = "";
	        this.jugador = "";
	    }
	    //getters
	    public String getCompeticion() {
	        return competicion;
	    }
	    public String getClub() {
	        return club;
	    }
	    public String getJugador() {
	        return jugador;
	    }
	    //setters
	    public void setCompeticion(String competicion) {
	        this.competicion = competicion;
	    }
	    public void setClub(String club) {
	        this.club = club;
	    }
	    public void setJugador(String jugador) {
	        this.jugador = jugador;
	    }
	    //metodos generales
	    public int calcularPuntuacion() {
	        int puntuacion = 5;
	        if (competicion.equals("Liga de Campeones")) {
	            puntuacion += 3;
	        } else if (competicion.equals("Liga")) {
	            puntuacion += 2;
	        }
	        if (club.equals("Barça") || club.equals("Madrid")) {
	            puntuacion += 1;
	        }
	        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) {
	            puntuacion += 1;
	        }
	        setPuntuacion(puntuacion);
	        return puntuacion;
	    }
	     public double calcularPrecio() {
	        double precio = 300;
	        if (competicion.equals("Liga de Campeones")) {
	            precio += 100;
	        } else if (competicion.equals("Liga")) {
	            precio += 0;
	        }
	        if (club.equals("Barça") || club.equals("Madrid")) {
	            precio += 100;
	        }
	        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) {
	            precio += 50;
	        }
	        setPrecio(precio);
	        return precio;
    }
}
