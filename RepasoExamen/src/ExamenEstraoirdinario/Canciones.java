package ExamenEstraoirdinario;

public class Canciones {

    protected String nombre;
    protected double duracion;

    public Canciones(String nombre, double duracion){

        this.nombre=nombre;
        this.duracion=duracion;
    }

    @Override
    public String toString() {
        return "{\"" + nombre + "\", \"" + duracion + "\"}";
    }

}
