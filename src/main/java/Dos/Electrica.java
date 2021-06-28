package Dos;

public class Electrica implements IInstalacion{

    String nombre;
    double precio;
    IFormaDePago pago;

    public Electrica(String nombre, double precio, IFormaDePago pago) {
        this.nombre = nombre;
        this.precio = precio;
        this.pago=pago;
    }
    @Override
    public void pagar() {
        pago.pagar(precio);
    }


}