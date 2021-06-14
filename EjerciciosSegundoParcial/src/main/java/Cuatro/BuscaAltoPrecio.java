package Cuatro;

import java.util.List;

public class BuscaAltoPrecio implements IPrecio{

    @Override
    public void buscaPrecio(List<Celular> list, int precio) {

        System.out.println("Busqueda entre bastantes elementos según el precio..." + precio);

        for (Celular c : list) {
            if (c.getModelo().equals(precio)) {
                c.mostrarInfo();
            }
        }

    }

}
