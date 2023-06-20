package ExamenEstraoirdinario;

import java.util.ArrayList;

public class Cantante implements interfaz_cantante{

    private String NombreApellido;
    private int Caché;
    private String GeneroMusical;

    public ArrayList <Disco> discografia;


    public Cantante(String nombre, int Cache, String Genero){

        discografia = new ArrayList<>();
        this.NombreApellido=nombre;
        this.Caché=Cache;
        this.GeneroMusical = Genero;

    }

    @Override
    public String toString() {
        return "Cantante: " +
                  NombreApellido+"\n"+
                "Caché: " + Caché+"€" +"\n" +
                "GeneroMusical: " + GeneroMusical  + "\n" +
                 discografia;
    }

    public String toCantante() {
        return "Cantante: " +
                NombreApellido+"\n"+
                "Caché: " + Caché+"€" +"\n" +
                "GeneroMusical: " + GeneroMusical;
    }

    public int getCaché(){

        return this.Caché;
    }
    @Override
    public Hit getHit() {
        return null;
    }
}
