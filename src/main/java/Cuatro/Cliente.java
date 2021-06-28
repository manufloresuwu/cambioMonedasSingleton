package Cuatro;

public class Cliente {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Server(), new Server());

        proxy.registrar("Camilo", "aba");
        proxy.registrar("Kamila", "ickkck");
        proxy.registrar("Ander", "patitodehule");
        proxy.registrar("Luis", "criesinquechua");
        proxy.registrar("Rebeka", "furniterfur");
        proxy.registrar("Luciana", "colombiagruesa");

        proxy.ingresar("Luis", "criesinquechua");

        proxy.ingresar("Camilo", "aba");
        proxy.ingresar("Kamila", "ickkck");
        proxy.ingresar("Ander", "patitodehule");
        proxy.ingresar("Luis", "criesinquechua");
        proxy.ingresar("Rebeka", "furniterfur");
        proxy.ingresar("Luciana", "colombiagruesa");

    }

}
