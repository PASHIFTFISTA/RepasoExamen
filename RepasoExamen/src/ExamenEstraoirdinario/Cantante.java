package ExamenEstraoirdinario;

import java.util.ArrayList;

public class Cantante implements interfaz_cantante{

    private String NombreApellido;
    private double Caché;
    private String GeneroMusical;

    ArrayList <Disco> discografia;


    public Cantante(String nombre, double Cache, String Genero){

        discografia = new ArrayList<>();
        this.NombreApellido=nombre;
        this.Caché=Cache;
        this.GeneroMusical = Genero;

    }

    @Override
    public String toString() {
        return "Cantante{" +
                "NombreApellido='" + NombreApellido + '\'' +
                ", Caché=" + Caché +
                ", GeneroMusical='" + GeneroMusical + '\'' +
                ", discografia=" + discografia +
                '}';
    }

    @Override
    public Hit getHit() {
        return null;
    }
}
