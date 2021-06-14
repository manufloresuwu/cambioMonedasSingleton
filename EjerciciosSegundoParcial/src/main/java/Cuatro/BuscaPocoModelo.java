package Cuatro;

import java.util.*;

public class BuscaPocoModelo implements IModelo {

    @Override
    public void buscaPrecio(List<Celular> list, String modelo) {

        System.out.println("Busqueda entre pocos elementos según el modelo..." + modelo);

        for (Celular c : list) {
            if (c.getModelo().equals(modelo)) {
                c.mostrarInfo();
            }
        }

    }

}