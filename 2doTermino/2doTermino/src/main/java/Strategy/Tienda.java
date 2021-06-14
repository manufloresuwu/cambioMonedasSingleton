package Strategy;

import java.util.*;

public class Tienda {

    private IEstrategia estrategia;

    private List<Producto> lista = new LinkedList<Producto>();


    public void agregarProducto(Producto p) {
        lista.add(p);
    }

    public IEstrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(IEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    public List<Producto> getLista() {
        return lista;
    }

    public void setLista(List<Producto> lista) {
        this.lista = lista;
    }

    public void vender() {
        estrategia.vender(lista);
    }

}
