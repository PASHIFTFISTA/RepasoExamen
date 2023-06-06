package Tema4.Herencia;

public class Moto extends Vehiculo {

    private boolean sidecar;


    public Moto(int numRuedas) {
        super(numRuedas);
        this.sidecar=false;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }


    public Moto(String marca, int numRuedas, String matricula, double cilindrada, boolean sidecar) {
        super(marca, numRuedas, matricula, cilindrada);
        this.sidecar=sidecar;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "sidecar=" + sidecar +
                ", marca='" + marca + '\'' +
                ", numRuedas=" + numRuedas +
                ", matricula='" + matricula + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }

    @Override
    public double ContarKilometros() {
        super.ContarKilometros();

        this.kilometros=super.kilometros +10;
        return this.kilometros;
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public int getNumRuedas() {
        return super.getNumRuedas();
    }

    @Override
    public String getMatricula() {
        return super.getMatricula();
    }

    @Override
    public double getCilindrada() {
        return super.getCilindrada();
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public void setNumRuedas(int numRuedas) {
        super.setNumRuedas(numRuedas);
    }

    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula);
    }

    @Override
    public void setCilindrada(double cilindrada) {
        super.setCilindrada(cilindrada);
    }
}
