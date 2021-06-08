package ChainOfResponsability.ejercicio2;

public interface ISoftware {

    void setNext(ISoftware handler);
    ISoftware next();
    void resultadoHandler(Persona persona);

}
