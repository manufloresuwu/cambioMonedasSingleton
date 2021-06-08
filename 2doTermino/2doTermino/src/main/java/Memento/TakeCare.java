package Memento;

import java.util.*;

public class TakeCare {

    private List<Memento> stateSaved = new ArrayList<>();

    public void addMemento(Memento memento) {
        stateSaved.add(memento);
    }

    public Memento getMemento(int statePosition) {
        return stateSaved.get(statePosition);
    }

}
