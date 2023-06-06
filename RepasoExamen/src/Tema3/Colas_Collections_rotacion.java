package Tema3;

import java.util.ArrayList;
import java.util.Collections;

public class Colas_Collections_rotacion {
    public static void main(String[] args) {
        ArrayList<String> miColeccion = new ArrayList<String>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");
        System.out.println("Lista inicial: ");
        for (String elto : miColeccion) {
            System.out.print(elto + " ");
        }
        System.out.println();
// Pon tu código aquí

        for (int i = 0; i < 3; i++) {
            Collections.rotate(miColeccion, 1);
        }

        System.out.println("Lista Final: ");
        for (String elto : miColeccion) {
            System.out.print(elto + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("maximo "+Collections.max(miColeccion));//el primero

        System.out.println();
        System.out.println();
        System.out.println("minimo "+Collections.min(miColeccion));//el último

        System.out.println();
        System.out.println();
        Collections.sort(miColeccion);
        System.out.println("Ordenado alfabeticamente: "+miColeccion.toString().replace("[","").replace("]","").trim());
    }
}

