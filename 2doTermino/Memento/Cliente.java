package Memento;

import java.util.*;
public class Cliente {

    public static void main(String[] args) {

        TakeCare tc = new TakeCare();
        Originator or = new Originator();
        BaseDeDatos datos;
        List<Persona> bd = new ArrayList<>();

        Persona p1 = new Persona("Thomas", "234578001", "25");
        Persona p2 = new Persona("Rachel", "3457912", "20");
        Persona p3 = new Persona("Rosario", "35646", "22");
        Persona p4 = new Persona("Julieta", "346898", "20");
        Persona p5 = new Persona("Garfiel", "3457890", "29");

        bd.add(p1);
        bd.add(p2);
        bd.add(p3);
        bd.add(p4);
        bd.add(p5);

        List<Persona> bd1 = new ArrayList<>();

        Persona p6 = new Persona("Lazaro", "3576690", "20");
        Persona p7 = new Persona("Micaela", "4570011", "19");
        Persona p8 = new Persona("Jaime", "421789", "23");
        Persona p9 = new Persona("Pilar", "45702", "27");
        Persona p10 = new Persona("Ximena", "3457123", "30");

        bd1.add(p6);
        bd1.add(p7);
        bd1.add(p8);
        bd1.add(p9);
        bd1.add(p10);

        List<Persona> bd2 = new ArrayList<>();

        Persona p11 = new Persona("Camille", "7889534243", "34");
        Persona p12 = new Persona("Ada", "23456", "21");
        Persona p13 = new Persona("Mozart", "344678978", "34");
        Persona p14 = new Persona("Daria", "342454", "22");
        Persona p15 = new Persona("Culmich", "2423455464757", "41");

        bd2.add(p11);
        bd2.add(p12);
        bd2.add(p13);
        bd2.add(p14);
        bd2.add(p15);

        List<Persona> bd3 = new ArrayList<>();

        Persona p16 = new Persona("Confetti", "9766456", "32");
        Persona p17 = new Persona("Shira", "3532324", "31");
        Persona p18 = new Persona("Luis", "467776876", "33");
        Persona p19 = new Persona("Adrian", "3534456657", "22");
        Persona p20 = new Persona("Adriana", "5678753", "21");

        bd3.add(p16);
        bd3.add(p17);
        bd3.add(p18);
        bd3.add(p19);
        bd3.add(p20);

        List<Persona> bd4 = new ArrayList<>();

        Persona p21 = new Persona("Waraki", "5434675", "34");
        Persona p22 = new Persona("Ytiri", "3456677", "18");
        Persona p23 = new Persona("Kena", "30876754", "20");
        Persona p24 = new Persona("Setristi", "2432345", "23");
        Persona p25 = new Persona("Furyan", "75768769", "26");

        bd4.add(p21);
        bd4.add(p22);
        bd4.add(p23);
        bd4.add(p24);
        bd4.add(p25);


        datos = new BaseDeDatos("Backup Marzo", bd);
        or.setState(datos);
        datos = new BaseDeDatos("Backup Abril", bd1);
        or.setState(datos);
        tc.addMemento(or.createMemento());
        datos = new BaseDeDatos("Backup Mayo", bd2);
        or.setState(datos);
        datos = new BaseDeDatos("Backup Junio", bd3);
        or.setState(datos);
        tc.addMemento(or.createMemento());
        datos = new BaseDeDatos("Backup Julio", bd4);
        or.setState(datos);


        or.restoreFromMemento(tc.getMemento(0));
        or.restoreFromMemento(tc.getMemento(1));

    }

}
