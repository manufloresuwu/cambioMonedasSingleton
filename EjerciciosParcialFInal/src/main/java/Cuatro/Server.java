package Cuatro;

public class Server implements IServer {

    @Override
    public void ingresar(String usuario, String password) {
        System.out.println("Se esta atendiendo al usuario: " + usuario);

    }

}