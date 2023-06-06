package Tema4.Asociasion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Curso curso1 = new Curso("Matemáticas");
        Curso curso2 = new Curso("Física");

        Profesor profesor = new Profesor("Juan Pérez");


        profesor.agregarCurso(curso1);
        profesor.agregarCurso(curso2);

        Profesor profesor2 = new Profesor("supu");

        Curso curso3 = new Curso("ed fisica");

        profesor2.agregarCurso(curso3);

        profesor.eliminarCursos();
    }
}
