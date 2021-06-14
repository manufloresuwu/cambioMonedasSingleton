package Tres;

import java.util.*;

public class Commit {

    private List<Memento> list= new ArrayList<>();

    public void addMemento(Memento m){
        list.add(m);
    }

    public Memento getVersion(int posicion){
        return list.get(posicion);
    }

}
