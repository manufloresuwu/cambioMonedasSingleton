package Composite;

public class Cliente {

    public static void main(String[] args) {
        Composite c1 = new Composite("Computadora");
        Composite c2 = new Composite("Computadora");
        Composite c3 = new Composite("Computadora");

        Composite l1 = new Composite("Laboratorio");
        l1.add(c1);
        l1.add(c2);
        l1.add(c3);

        Composite l2 = new Composite("Laboratorio");
        l2.add(c1);
        l2.add(c2);
        l2.add(c3);

        Composite l3 = new Composite("Laboratorio");
        l3.add(c1);
        l3.add(c2);
        l3.add(c3);

        Composite con1 = new Composite("Contenedor");
        con1.add(l1);
        con1.add(l2);
        con1.add(l3);

        con1.precio();

    }

}
