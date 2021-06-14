package Cuatro;

import java.util.*;

public class Cliente {

    public static void main(String[] args) {

        Tienda t = new Tienda(3);
        List<Celular> p = new LinkedList<Celular>();

        p.add(new Celular("Note 50","Samsung","Muy Alta",10000));
        p.add(new Celular("Note 7","Xiaomi","Baja",1200));
        p.add(new Celular("Xperia","Sony","Alta",5000));

        t.setList(p);

        t.buscarModelo("Xperia");
        t.buscarPrecio(1200);

    }

}
