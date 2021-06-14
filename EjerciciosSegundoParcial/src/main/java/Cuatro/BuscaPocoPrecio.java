package Cuatro;

import java.util.*;

public class BuscaPocoPrecio implements IPrecio {

    @Override
    public void buscaPrecio(List<Celular> list, int precio) {

        System.out.println("Busqueda entre pocos elementos según el precio..." + precio);

        for (Celular c : list) {
            if (c.getModelo().equals(precio)) {
                c.mostrarInfo();
            }
        }

    }

}
