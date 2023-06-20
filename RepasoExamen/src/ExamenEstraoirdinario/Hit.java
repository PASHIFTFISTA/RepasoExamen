package ExamenEstraoirdinario;

public class Hit extends Canciones{

    private float visualizaciones;

    @Override
    public String toString() {
        return String.format("{\"%s\", \"%s\", \"%.0f\"}", nombre, duracion, visualizaciones);
    }



    public Hit(String nombre, double duracion, float visitas) {
        super(nombre, duracion);
        this.visualizaciones=visitas;
    }
}
