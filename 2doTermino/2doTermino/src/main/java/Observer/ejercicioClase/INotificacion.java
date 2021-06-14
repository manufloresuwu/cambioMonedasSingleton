package Observer.ejercicioClase;

public interface INotificacion {

    void attach(ICliente observer);
    void deattach(ICliente observer);
    void notifyObserver(Notificacion notificacion);

}
