package Cinco;

public class UsuarioWapp extends Usuario{

    private String nombre;

    public UsuarioWapp(CanalComunicacion mediator, String nombre) {
        super(mediator);
        this.nombre=nombre;
    }

    @Override
    public void messageReceived(String message) {
        System.out.println(nombre + " recibio el mensaje: ");
        System.out.println(message);

    }

    @Override
    public void sendPerson(String message, Usuario destino) {
        mediator.send(message, destino);

    }

    @Override
    public void sendGroup(String message, String grupo) {
        mediator.sendGroup(message, grupo, this);

    }


}
