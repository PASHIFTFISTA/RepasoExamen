package Tema4.Herencia.Examen;

public class Rectangulo extends Poligono{

    private int lado2;

    public Rectangulo(int lado1, int lado2) {
        super(lado1);
        this.lado2=lado2;
    }

    public Rectangulo(int lado1){
        super(lado1);
    }

    @Override
    public double getArea() {

        if (this.lado2<=0){

            Poligono cuadrado = new Cuadrado(this.lado1);
            return cuadrado.getArea();
        } else {

            return this.lado1*lado2;
        }
    }

    @Override
    public double getPerimetro() {

        if (this.lado2<=0){

            Poligono cuadrado = new Cuadrado(this.lado1);
            return cuadrado.getPerimetro();
        } else {

            return 2 * this.lado1 + 2 * this.lado2;
        }
    }
}
