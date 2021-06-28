package Dos;

public class Efectivo implements IFormaDePago {

    @Override
    public void pagar(double monto) {
        System.out.println("Monto a pagar: " + monto);

    }

}