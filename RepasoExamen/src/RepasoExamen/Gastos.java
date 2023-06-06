package RepasoExamen;

import java.util.ArrayList;

public class Gastos {
    private String mes;
    private String anno;
    double totalGastos=0;


    ArrayList <Compra> cuentas;

    public Gastos(String mes, String anno) {
        this.mes = mes;
        this.anno = anno;
        this.cuentas = new ArrayList<>();
    }

    public void addCompra (Compra compra){

        cuentas.add(compra);
    }

    @Override
    public String toString() {
        return "Gastos{" +
                "mes='" + mes + '\'' +
                ", anno='" + anno + '\'' +
                ", totalGastos=" + totalGastos +
                ", cuentas=" + cuentas +
                '}';
    }

    public double calcularGastos(){
        for (Compra aux:cuentas) {

            totalGastos+=aux.getTotalCompra();

        }
        return totalGastos;
    }


}
