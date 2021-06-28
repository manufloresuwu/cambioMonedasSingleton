package Siete;

public class Presidente extends Duenios {

    String nombre;

    public Presidente(String nombre) {
        this.nombre=nombre;
    }


    @Override
    public void messageReceived(String mensaje) {
        System.out.println("El presidente "+nombre+" ha recibio el mensaje "+mensaje);

    }

}