package Tema4.Asociasion.Actores;

import java.util.Arrays;

public class Pelicula {

    private String titulo;
    private String director;
    private int duracion;
    private Actor[] actores;
    private int numActores=0;

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.actores = new Actor[15];
    }

    public Pelicula() {
        this.titulo = "El caballero Oscuro";
        this.director = "Christopher Nolan";
        this.duracion = 152;
        this.actores = new Actor[15];
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void addActor(Actor actor) {

        actores [this.numActores] = actor;

        this.numActores++;
    }

    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", actores="
                + Arrays.toString(actores) + ", numActores=" + numActores + "]";
    }

}
