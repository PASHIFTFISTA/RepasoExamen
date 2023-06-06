package Tema4.Agregacion;

import java.util.ArrayList;

public class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones;



    public Casa(){
        this.direccion="s/n";
    }
    public Casa(String direccion) {

        this.habitaciones=new ArrayList<>();
        this.direccion=direccion;
    }

    // Constructor, getters y setters

    public void agregarHabitacion(String nombre) {

        habitaciones.add(new Habitacion(nombre));
    }

    public void casas(Habitacion habitacion ){
        habitaciones.add(habitacion);
    }
}
