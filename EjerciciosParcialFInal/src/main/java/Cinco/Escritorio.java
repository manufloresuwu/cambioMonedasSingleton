package Cinco;

public class Escritorio implements IComputador {

    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando sesion en la app de escritorio");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesion en la app de escritorio");

    }

    @Override
    public void generarDatos() {
        System.out.println("Generando datos en la app de escritorio");

    }

}