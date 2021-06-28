package Cinco;

public class WindowsPhone implements IMovil {

    @Override
    public void login() {
        System.out.println("Login en la app WindowsPhone");

    }

    @Override
    public void logout() {
        System.out.println("Logout en la app WindowsPhone");

    }

    @Override
    public void reportes() {
        System.out.println("Generando reportes en la app WindowsPhone");

    }

}