package Observer.ejercicioClase;

public class Client {

    public static void main (String []args){

        NotificacionTelefonia notificacionTelefonia1 = new NotificacionTelefonia();
        ClienteRegistrado cliente1 = new ClienteRegistrado(new Persona("346478", "Luis"), "precios");
        ClienteRegistrado cliente2 = new ClienteRegistrado(new Persona("346478", "Luis2"), "precios");
        ClienteRegistrado cliente3 = new ClienteRegistrado(new Persona("346478", "Luis3"), "precios");

        notificacionTelefonia1.attach(cliente1);
        notificacionTelefonia1.attach(cliente2);
        notificacionTelefonia1.attach(cliente3);

        notificacionTelefonia1.uploadNewNotificacion(new Notificacion("precios", "Los precios de la semana son de 45 Bs."));

    }

}
