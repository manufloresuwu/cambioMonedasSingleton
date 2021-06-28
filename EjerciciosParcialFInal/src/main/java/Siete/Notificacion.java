package Siete;

import java.util.*;

public class Notificacion implements Notificador {

    List<Duenios> dueno;

    public Notificacion() {
        dueno = new LinkedList<Duenios>();
    }

    public void addDueno(Duenios nuevoDueno) {
        dueno.add(nuevoDueno);
    }

    @Override
    public void enviar(String mensaje) {
        for (Duenios duenios : dueno) {
            duenios.messageReceived(mensaje);
        }
    }

}