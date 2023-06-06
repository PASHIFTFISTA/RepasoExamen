package RepasoExamen;

public class Articulo {

    private String nombre;
    private double precio;


    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public double getprecio(){

        return this.precio;
    }


}
