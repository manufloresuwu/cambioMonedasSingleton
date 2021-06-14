package Cuatro;

import java.util.List;

public class BuscaAltoModelo implements IModelo{

    @Override
    public void buscaPrecio(List<Celular> list, String modelo) {

        System.out.println("Busqueda entre bastantes elementos según el modelo..." + modelo);

        for (Celular c : list) {
            if (c.getModelo().equals(modelo)) {
                c.mostrarInfo();
            }
        }

    }

}
