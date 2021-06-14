package Strategy;

import java.util.List;

public class Primavera implements IEstrategia{

    @Override
    public void vender(List<Producto> lista) {
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("Primavera: ");
        System.out.println("****************************************");
        System.out.println("****************************************");
        for (Producto producto : lista) {
            System.out.println("****************************************");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
        }

    }

}
