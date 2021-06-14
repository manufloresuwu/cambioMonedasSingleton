package Uno;

import java.util.*;

public class Versiones {

    private List<Version> list= new ArrayList<>();

    public void addMemento(Version v){
        list.add(v);
    }

    public Version getVersion(int posicion){
        return list.get(posicion);
    }

}
