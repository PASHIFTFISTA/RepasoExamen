package Tema4.Herencia.Examen;

public class Cuadrado extends Poligono {


    public Cuadrado(int lado1) {
        super(lado1);
    }

    @Override
    public double getArea() {
        return this.lado1*this.lado1;
    }

    @Override
    public double getPerimetro() {
        return 4*this.lado1;
    }
}
