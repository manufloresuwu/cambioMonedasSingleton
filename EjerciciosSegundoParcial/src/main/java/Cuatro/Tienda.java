package Cuatro;

import javax.rmi.CORBA.Tie;
import java.util.*;

public class Tienda {

    private IModelo m;
    private IPrecio p;
    private int value;
    private List<Celular> list = new LinkedList<Celular>();

    public Tienda(int value){
        this.value = value;
    }

    public void add(Celular c){
        list.add(c);
    }

    public IModelo getM(){
        return m;
    }

    public void setM(IModelo m){
        this.m = m;
    }

    public IPrecio getP(){
        return p;
    }

    public void setP(IPrecio p){
        this.p = p;
    }

    public List<Celular> getList() {
        return list;
    }

    public void setList(List<Celular> list) {
        this.list = list;
    }

    public void buscarPrecio(int precio) {
        if(list.size()>value) {
            p = new BuscaAltoPrecio();
        }else {
            p = new BuscaPocoPrecio();
        }
        p.buscaPrecio(list, precio);
    }

    public void buscarModelo(String modelo) {
        if(list.size()>value) {
            m = new BuscaAltoModelo();
        }else {
            m = new BuscaPocoModelo();
        }
        m.buscaPrecio(list, modelo);
    }

}
