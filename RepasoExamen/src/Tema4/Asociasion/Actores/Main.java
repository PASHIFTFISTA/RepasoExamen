package Tema4.Asociasion.Actores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);




            System.out.println("Quiere añadir una pelicula? ");

            Pelicula a =new Pelicula();

            System.out.println("Dime el titulo: ");
            a.setTitulo(in.nextLine());
            a.setDirector(in.nextLine());
            a.setDuracion(130);


        for (int i = 0; i < 4; i++) {

            String nombre = in.next();
            int fecha = in.nextInt();

            a.addActor(new Actor(nombre,fecha));
        }

            Actor actor1 = new Actor("Carlos", 1980);
            Actor actor2 = new Actor("Alvaro", 1970);

            a.addActor(actor1);
            a.addActor(actor2);


            System.out.println(a);





    }
}
