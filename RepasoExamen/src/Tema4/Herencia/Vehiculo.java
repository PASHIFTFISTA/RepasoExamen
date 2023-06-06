package Tema4.Herencia;

public class Vehiculo {

    protected String marca;
    protected int numRuedas;

    protected String matricula;
    protected double cilindrada;

    protected double kilometros;

    public Vehiculo(String marca, int numRuedas, String matricula, double cilindrada) {
        this.marca = marca;
        this.numRuedas = numRuedas;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public Vehiculo(int numRuedas){
        this.marca = "s/n";
        this.numRuedas = numRuedas;
        this.matricula = "s/n";
        this.cilindrada = 00;

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }


    public double ContarKilometros(){
        return kilometros;
    }
}
