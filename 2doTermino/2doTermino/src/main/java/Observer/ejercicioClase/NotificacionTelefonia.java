package Observer.ejercicioClase;

import java.util.*;

public class NotificacionTelefonia implements INotificacion{

    private List<ICliente> observerList= new ArrayList<>();

    private List<Notificacion> notificacionList = new ArrayList<>();

    public void uploadNewNotificacion(Notificacion notificacion){
        notificacionList.add(notificacion);
        this.notifyObserver(notificacion);
    }

    @Override
    public void attach(ICliente observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(ICliente observer) {
        observerList.remove(observer);
    }


    @Override
    public void notifyObserver(Notificacion notificacion) {
        for (ICliente userTelefonia:observerList) {
            if (userTelefonia.getCategoria().equals(notificacion.getCategoria())){
                // notificacion
                userTelefonia.update("La nueva notificacion dice: " + notificacion.getContenido(),notificacion);
            }

        }
    }

}
