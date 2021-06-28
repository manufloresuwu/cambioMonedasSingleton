package Cinco;

public class Cliente {

    public static void main(String[] args) {

        IOS minecraft = new IOS();
        Adaptado facebook = new Adaptado(new Web());
        Adaptado word = new Adaptado(new Escritorio());

        minecraft.login();
        minecraft.logout();
        minecraft.reportes();

        facebook.login();
        facebook.logout();
        facebook.reportes();

        word.login();
        word.logout();
        word.reportes();
    }

}
