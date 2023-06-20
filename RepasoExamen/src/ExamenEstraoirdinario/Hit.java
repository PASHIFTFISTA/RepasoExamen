package ExamenEstraoirdinario;

public class Hit extends Canciones{

    private float visualizaciones;

    @Override
    public String toString() {
        return "Hit{" +
                "visualizaciones=" + visualizaciones +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                '}';
    }

    public Hit(String nombre, double duracion, float visitas) {
        super(nombre, duracion);
        this.visualizaciones=visitas;
    }
}
