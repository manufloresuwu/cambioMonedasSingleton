package Cinco;

import java.util.*;

public class WApp implements CanalComunicacion {

    private List<Grupo> grupos = new LinkedList<Grupo>();

    public void addGrupo(Grupo grupo) {
        grupos.add(grupo);
    }
    @Override
    public void send(String message, Usuario usuario) {
        usuario.messageReceived(message);
    }

    @Override
    public void sendGroup(String message, String nombreGrupo, Usuario origen) {
        Grupo grupoActual = new Grupo("");
        for (Grupo grupo : grupos) {
            if(grupo.getNombre().equals(nombreGrupo)) {
                grupoActual=grupo;
                break;
            }
        }
        for (Usuario usuario : grupoActual.getGrupo()) {
            if(!usuario.equals(origen)) {
                usuario.messageReceived(message);
            }
        }
    }

}
