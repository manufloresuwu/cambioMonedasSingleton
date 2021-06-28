package Dos;

public class Agua implements IInstalacion{

    String nombre;
    double precio;
    IFormaDePago pago;

    public Agua(String nombre, double precio, IFormaDePago pago) {
        this.nombre = nombre;
        this.precio = precio;
        this.pago=pago;
    }

    @Override
    public void pagar() {
        pago.pagar(precio);
    }

}
