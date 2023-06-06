package RepasoExamen;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        //ejercicio1
        String [] lista;

        String cadena = in.nextLine();

        lista = cadena.split(" ");


        ArrayList <String> listado = new ArrayList();

        for (String aux : lista){

            if (!(aux.equalsIgnoreCase("fin"))){
                aux = aux.toLowerCase();
                aux = aux.substring(0,1).toUpperCase()+aux.substring(1);
                listado.add(aux);
            }
        }

        System.out.println();
        //Ejercicio2

        System.out.println("Listado de Juan: ");
        System.out.println(listado.toString().replace("[","").replace("]","").trim());

        HashSet <String> sinRepetidos = new HashSet<>(listado);

        System.out.println();

        listado.removeAll(listado);

        listado.addAll(sinRepetidos);
        listado.sort(null);

        System.out.println();
        System.out.println("Listado de María: ");
        System.out.println(listado.toString().replace("[","").replace("]","").trim());

        //Ejercicio3

        HashMap <String, Integer> factura = new HashMap<>();

        for (String aux:listado) {

            factura.put(aux,null);
        }


        int total=0;
        for (Map.Entry<String,Integer> aux: factura.entrySet()){

            System.out.print(aux.getKey()+": ");
            factura.put(aux.getKey(),in.nextInt());

            total+=aux.getValue();
        }

        System.out.println("TICKET DE COMPRA:");

        for (Map.Entry<String,Integer> aux: factura.entrySet()){

            System.out.println((aux.getKey()+"              "+aux.getValue()+"€").toString());
        }
        System.out.println("Total: "+total);



        Articulo patatas = new Articulo("patatas", 1.90);
        Articulo sal = new Articulo("sal", 1.05);

        Compra compra1 = new Compra(new Date(),"Dia");

        compra1.addArt(patatas);
        compra1.addArt(sal);


        Compra compra2 = new Compra(new Date(),"fc");

        compra2.addArt(patatas);


        Gastos gasto1 = new Gastos("Junio", "2023");
        gasto1.addCompra(compra1);
        gasto1.addCompra(compra2);
        gasto1.addCompra(compra2);


        StringBuilder string = new StringBuilder(cadena);

        cadena = string.toString();



    }



}
