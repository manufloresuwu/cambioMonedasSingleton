package Proxy;

public class Cliente {
    public static void main(String[] args) {

        RealTarjeta tarjeta = new RealTarjeta(new TarjetaDebito(200));

        tarjeta.comprar(70, "bolivianos");
        tarjeta.comprar(200, "euros");
        tarjeta.ingresarFondos(140, "dolares");
        tarjeta.comprar(66, "pesos");

    }
}