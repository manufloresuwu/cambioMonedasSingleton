package Tres;

public interface IVersion {

    void attach(ISuscripcion observer);
    void deattach(ISuscripcion observer);
    void notifyObserver(int version);

}
