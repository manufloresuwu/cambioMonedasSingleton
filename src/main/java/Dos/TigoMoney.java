package Dos;

public class TigoMoney implements IFormaDePago {

    @Override
    public void pagar(double monto) {
        System.out.println("Monto a pagar: " + (monto*0.98));

    }

}