package Strategy;

import java.util.List;

public class Verano implements IEstrategia{

    @Override
    public void vender(List<Producto> lista) {
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("Verano: ");
        System.out.println("****************************************");
        System.out.println("****************************************");
        for (Producto producto : lista) {
            System.out.println("****************************************");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + (producto.getPrecio()*0.9));
        }

    }

}
