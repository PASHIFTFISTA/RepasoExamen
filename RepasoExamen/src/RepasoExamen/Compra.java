package RepasoExamen;

import java.util.ArrayList;
import java.util.Date;

public class Compra {


    ArrayList<Articulo> productos;
    double total = 0;
    private Date fecha;

    @Override
    public String toString() {
        return "Compra{" +
                "productos=" + productos +
                ", total=" + total +
                ", fecha=" + fecha +
                ", supermercado='" + supermercado + '\'' +
                '}';
    }

    private String supermercado;

    public Compra(Date fecha, String supermercado) {
        this.productos = new ArrayList<>();
        this.fecha = fecha;
        this.supermercado = supermercado;
    }

    public void addArt(Articulo articulo){

        productos.add(articulo);

    }

    public double calcularTicket(){


        for (Articulo aux:productos) {

            total += aux.getprecio();

        }

        return total;
    }

    public double getTotalCompra(){

        return this.total;
    }
}
