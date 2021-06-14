package Strategy;

import java.util.*;

public class Cliente {

    public static void main(String[] args) {

        Tienda t = new Tienda();
        List<Producto> lista = new LinkedList<Producto>();

        lista.add(new Producto("Short", 50));
        lista.add(new Producto("Pantalon", 400));
        lista.add(new Producto("Chinelas", 80));
        lista.add(new Producto("Chompa", 540));
        lista.add(new Producto("Chaleco", 765));

        t.setLista(lista);

        t.setEstrategia(new Primavera());
        t.vender();

        t.setEstrategia(new Verano());
        t.vender();

        t.setEstrategia(new Otonio());
        t.vender();

        t.setEstrategia(new Invierno());
        t.vender();

    }

}