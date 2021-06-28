package Cinco;

public class Web implements IComputador {

    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando sesion en la app web");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesion en la app web");

    }

    @Override
    public void generarDatos() {
        System.out.println("Generando datos en la app web");

    }

}