package Cinco;

import java.util.*;

public interface CanalComunicacion {

    void send( String message, Usuario usuario);
    void sendGroup(String message, String nombreGrupo, Usuario Origen);

}
