package Command;

import java.util.*;

public class Invoker {

    private List<IAccion> listaAccion = new ArrayList<>();

    public void addCommand(IAccion concreteCommand) {
        listaAccion.add(concreteCommand);
    }

    public void executeCommands() {
        for (IAccion command : listaAccion) {
            command.execute();
        }
        listaAccion.clear();
    }

}
