package ExamenEstraoirdinario;

import java.util.ArrayList;

public class Disco {


    private String titulo;
    private int Lanzamiento;

    private Hit HIT;
    ArrayList <Canciones> disco;

    @Override
    public String toString() {
        return "Disco{" +
                "titulo='" + titulo + '\'' +
                ", Lanzamiento=" + Lanzamiento +
                ", HIT=" + HIT +
                ", disco=" + disco +
                '}';
    }

    public Disco (String titulo, int year){
        disco = new ArrayList<>();
        this.titulo = titulo;
        this.Lanzamiento=year;
    }

    public void setHit(String nombre, double duracion, float visitas){

        HIT = new Hit(nombre, duracion, visitas);
    }


}
