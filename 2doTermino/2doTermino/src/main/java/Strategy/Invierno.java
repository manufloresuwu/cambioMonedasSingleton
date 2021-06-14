package Strategy;

import java.util.*;

public class Invierno implements IEstrategia{

    @Override
    public void vender(List<Producto> lista) {
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("Invierno: ");
        System.out.println("****************************************");
        System.out.println("****************************************");
        for (Producto producto : lista) {
            System.out.println("****************************************");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + (producto.getPrecio()*1.1));
        }

    }

}