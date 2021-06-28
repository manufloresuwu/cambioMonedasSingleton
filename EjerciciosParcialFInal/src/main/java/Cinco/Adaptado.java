package Cinco;

public class Adaptado implements IMovil {
    private IComputador appC;

    public Adaptado(IComputador appC) {
        System.out.println("Adaptando La aplicacion del computador a una movil");
        this.appC = appC;
    }

    @Override
    public void login() {
        appC.iniciarSesion();
    }

    @Override
    public void logout() {
        appC.cerrarSesion();

    }

    @Override
    public void reportes() {
        appC.generarDatos();

    }

}
