package ChainOfResponsability.ejercicioClase;

public interface ISoftware {

    void setNext(ISoftware encargado);

    ISoftware next();

    void resultadoHandler(String resultado);

}
