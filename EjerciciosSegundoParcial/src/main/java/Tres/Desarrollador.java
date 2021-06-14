package Tres;

public class Desarrollador implements ISuscripcion{

    private String nombre;
    public Desarrollador(String nombre) {
        this.nombre=nombre;
    }
    @Override
    public void update(String message) {
        System.out.println(nombre + " recibio la actualización:");
        System.out.println(message);

    }
}
