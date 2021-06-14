package Cinco;

import java.util.*;

public class Cliente {

    public static void main(String[] args) {
        WApp wp = new WApp();

        Usuario u1 = new UsuarioWapp(wp, "Andrea");
        Usuario u2 = new UsuarioWapp(wp, "Camila");
        Usuario u3 = new UsuarioWapp(wp, "Carla");
        Usuario u4 = new UsuarioWapp(wp, "Kaleb");
        Usuario u5 = new UsuarioWapp(wp, "Damian");
        Usuario u6 = new UsuarioWapp(wp, "Cristian");
        Usuario u7 = new UsuarioWapp(wp, "Pilar");
        Usuario u8 = new UsuarioWapp(wp, "Pablo");
        Usuario u9 = new UsuarioWapp(wp, "Esteban");
        Usuario u10 = new UsuarioWapp(wp, "Samira");

        List<Usuario> l = new LinkedList<Usuario>();
        l.add(u1);
        l.add(u2);
        l.add(u3);
        l.add(u4);
        l.add(u5);
        l.add(u6);
        l.add(u7);
        l.add(u8);
        l.add(u9);
        l.add(u10);

        Grupo g1 = new Grupo("Antisocialsocialhub");
        g1.setGrupo(l);
        wp.addGrupo(g1);
        u1.sendPerson("Probando", u2);
        u10.sendGroup("Probando 2", g1.getNombre());

    }

}