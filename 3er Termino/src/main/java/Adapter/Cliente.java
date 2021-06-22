package Adapter;

public class Cliente {

    public static void main(String[] args) {

        IAdapterEmp1 celular = new Celular("3500 Bs", "3 anios");
        IAdapterEmp1 tablet = new Tablet("1200 Bs", "5 anios");
        IAdapterEmp1 computadora = new Computadora("7600 Bs", "10 anios");

        IAdapterEmp1 televisor = new Adapter(new Televisor("2200 Bs", "2 anios"));
        IAdapterEmp1 lavadora = new Adapter(new Lavadora("7300 Bs", "4 anios"));
        IAdapterEmp1 refrigerador = new Adapter(new Refrigerador("4000 Bs", "15 anios"));

        celular.precio();
        celular.tiempoDeVida();

        tablet.precio();
        tablet.tiempoDeVida();

        computadora.precio();
        computadora.tiempoDeVida();

        televisor.precio();
        televisor.tiempoDeVida();

        lavadora.precio();
        lavadora.tiempoDeVida();

        refrigerador.precio();
        refrigerador.tiempoDeVida();

    }

}