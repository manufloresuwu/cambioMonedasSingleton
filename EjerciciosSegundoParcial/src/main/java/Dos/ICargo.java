package Dos;

public interface ICargo {

    void setNext(ICargo iCargo);
    ICargo next();
    void tarea (String accion);

}
