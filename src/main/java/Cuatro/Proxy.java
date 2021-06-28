package Cuatro;

import java.util.*;

public class Proxy implements IServer {
    List<Usuario> usuarios;
    IServer servidor1;
    IServer servidor2;
    int numeroUsuarios;

    public Proxy(IServer servidor1, IServer servidor2) {
        usuarios = new LinkedList<Usuario>();
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
        numeroUsuarios = 0;
    }

    public void registrar(String usuario, String contrasena) {
        numeroUsuarios++;
        usuarios.add(new Usuario(numeroUsuarios, usuario, contrasena));
    }

    @Override
    public void ingresar(String usuario, String password) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario)) {
                if (u.getContrasena().equals(password)) {
                    if (u.id % 2 == 0) {
                        System.out.println("El server 2 esta realizando una accion");
                        servidor2.ingresar(usuario, password);
                    } else {
                        System.out.println("El server 1 está realizando una accion");
                        servidor1.ingresar(usuario, password);
                    }
                } else {
                    System.out.println("Contrasenia incorrecta");
                }
            }
        }

    }

}