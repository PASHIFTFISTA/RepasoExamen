package Tema4.Agregacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        Casa casa = new Casa("123 Calle Principal");

        casa.agregarHabitacion("Dormitorio");
        casa.agregarHabitacion("Cocina");

        Casa casa2 = new Casa("");


    }
}
