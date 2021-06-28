package Siete;

public class VicePresidente extends Duenios {

    String nombre;

    public VicePresidente(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void messageReceived(String mensaje) {
        System.out.println("El vicepresidente " + nombre + " ha recibio el mensaje " + mensaje);

    }


}