package ExamenEstraoirdinario;

import java.util.*;

public class Productora {

    public static void main(String[] args) {
        ArrayList <Cantante> cantantes = new ArrayList<>();


        Cantante Miley = new Cantante("Miley Cyrus",500000,"POP");
        Disco Miley1 = new Disco("Endless summer vacation", 2023);

        Canciones cancion1 = new Canciones("Jaded",3.05);
        Canciones cancion2 = new Canciones("Rose Colored Lenses",3.43);
        Canciones cancion3 = new Canciones("Thousand Miles",3.51);
        Canciones cancion4 = new Canciones("you",2.59);
        Canciones cancion5 = new Canciones("Handstad",3.25);
        Canciones cancion6 = new Canciones("River",2.42);
        Miley1.setHit("Flowers",3.20,10975946);
        Miley1.disco.add(cancion1);
        Miley1.disco.add(cancion2);
        Miley1.disco.add(cancion3);
        Miley1.disco.add(cancion4);
        Miley1.disco.add(cancion5);
        Miley1.disco.add(cancion6);

        Miley.discografia.add(Miley1);

        cantantes.add(Miley);

        Cantante aux = cantantes.get(0);

        for (Cantante cantante:cantantes) {

            if (cantante.getCaché()> aux.getCaché()){
                aux=cantante;
            }

        }
        Cantante Mile = new Cantante("Miley circus",600000,"POP");

        Cantante asasas = new Cantante("Msass",100000,"POP");

        cantantes.add(asasas);

        cantantes.add(Mile);


        // Ordenar los cantantes por caché descendente
        Collections.sort(cantantes, Comparator.comparingInt(Cantante::getCaché).reversed());




        System.out.println(cantantes.get(1).toString().replace("[","").replace("]","").trim());


        for (Cantante aux2:cantantes) {

            System.out.println();
            System.out.println(aux2.toCantante());
            System.out.println();
        }

        Scanner in = new Scanner(System.in);

        boolean flag = true;
        int num=0;

        boolean menu = true;


        do {

            System.out.println("********LOVING JAVA****");
            System.out.println();

            System.out.println("1. Ver Cantantes de la productora ordenados por\n caché.");
            System.out.println("2. Ver Discos de un cantante con sus canciones");
            System.out.println("3. Ver Hits de un cantante");
            System.out.println("4. Comprar concierto privado");
            System.out.println("5. Salir");

            while (flag){

                try {
                    num = in.nextInt();

                    if (num<=0 || num>5){
                        throw new NumberFormatException();
                    }

                    flag = false;
                } catch (NumberFormatException a){
                    System.out.println("Introduzca una opcion válida, entre el 1 y el 5");
                } catch (InputMismatchException b){
                    System.out.println("Opción no válida, introduzca un número entero");
                    in.next();
                }

            }
            flag = true;

            switch (num){
                case 1:



                    break;
                case 2:



                    break;
                case 3:


                    break;
                case 4:



                    break;
                case 5:



                    break;
            }


        } while (menu);



    }
}
