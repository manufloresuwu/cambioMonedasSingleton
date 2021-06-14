package Strategy;

import java.util.List;

public class Otonio implements IEstrategia{

    @Override
    public void vender(List<Producto> lista) {
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("Otonio: ");
        System.out.println("****************************************");
        System.out.println("****************************************");
        for (Producto producto : lista) {
            System.out.println("****************************************");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + (producto.getPrecio()*0.5));
        }

    }

}