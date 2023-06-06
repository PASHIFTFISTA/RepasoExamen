package Tema4.Asociasion.Actores;

public class Actor {

    private String nombre;
    private int nacimiento;

    public Actor() {
        this.nombre = "Miguel";
        this.nacimiento = 1996;
    }

    @Override
    public String toString() {
        return "Actor [nombre=" + nombre + ", nacimiento=" + nacimiento + "]";
    }

    public Actor(String nombre, int nacimiento) {

        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

}
