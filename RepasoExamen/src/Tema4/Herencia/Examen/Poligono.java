package Tema4.Herencia.Examen;

abstract class Poligono {

    protected int lado1;

    public Poligono(int lado1) {
        this.lado1 = lado1;
    }

    public abstract double getArea();
    public abstract double getPerimetro();

}
