package ChainOfResponsability.ejercicio3;

public interface IArray {

    void setNext(IArray handler);
    IArray next();
    void reparto(Persona persona);

}
