package Tema4.Herencia.Examen;

public class Main {
    public static void main(String[] args) {

        System.out.println("rectangulo");
        Poligono rectangulo = new Rectangulo(3,2);
        System.out.println(rectangulo.getPerimetro());

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("cuadrado");
        Poligono cuadrado = new Cuadrado(5);

        System.out.println(cuadrado.getPerimetro());
    }
}
