package Proxy;

public interface ITarjeta {

    void comprar(double monto, String moneda);

    void ingresarFondos(double monto, String moneda);

}