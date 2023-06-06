package Tema3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_repaso {

    public static void main(String[] args) {
        int [] numeros = {1,4,9,7,3,2,5,11,0,9};
//Utiliza este for para realizar el intercambio tal y como muestra el gráfico
        for (int i = 0; i < numeros.length/2; i++) {

            int aux;
            aux = numeros[i];
            // aux es igual a la posicion 0,1 ,2 3 ,4 { 1,4,9,7,3}

            numeros[i]= numeros[numeros.length/2+i];
            //numero [i] = {2,5,11,0,9}

            numeros [numeros.length/2+i] = aux;
            //numeros[a partir de la mitad del array] = aux
        }
        System.out.println(Arrays.toString(numeros));

//Buscar mayusculas y minusculas
        Scanner in = new Scanner(System.in);

        String cadena = in.nextLine();

        String aux = cadena;
        aux = aux.toLowerCase();
        int contador=0;
        int num=0;

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i)==aux.charAt(i)){
                num++;
            } else {
                contador++;
            }
        }

        System.out.println("mayusculas: "+contador);
        System.out.println("minusculas: "+num);


        //Palindromo
        StringBuilder palindromo = new StringBuilder(cadena);

        palindromo=palindromo.reverse();

        if (palindromo.equals(cadena)){

            System.out.println("Palindromo!!!");
        } else {

            System.out.println("NO");
        }


        String[] nuevo = palindromo.toString().split("");
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(nuevo));

        Collections.addAll(lista, nuevo);

        System.out.println(lista);


        System.out.println();
        Collections.addAll(lista,nuevo);

        System.out.println(lista);



    }
}
