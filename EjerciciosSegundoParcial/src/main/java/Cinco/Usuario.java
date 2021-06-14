package Cinco;

import java.util.*;

public abstract class Usuario {

    protected CanalComunicacion mediator;

    public Usuario(CanalComunicacion mediator){
        this.mediator=mediator;
    }

    public abstract void sendPerson(String message,Usuario destino);

    public abstract void sendGroup(String message,String grupo);


    public abstract void messageReceived(String message);

}
