package Tema4.Asociasion;

import java.util.ArrayList;

public class Profesor {
    private String nombre;
    private ArrayList<Curso> cursos;

    public Profesor(String nombre) {

        this.nombre=nombre;
    }

    // Constructor, getters y setters

    public void agregarCurso(Curso curso) {

        cursos.add(curso);
    }

    public void eliminarCursos (){
        cursos.removeAll(cursos);
    }
}
