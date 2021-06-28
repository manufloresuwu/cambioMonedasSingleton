package Seis;

public class Cliente {

    public static void main(String[] args) {

        Celular cel = new Celular("Xiaomi Note8", "128 Gb", "45 Mpx", "16 Gb", "Oreo Android");
        Computadora comp = new Computadora("Samsung Experience", "2 Tb", "20 Gb");
        Televisor t = new Televisor("Samsung WebOs", "5400 Px", "2 anios", true);
        Mantenimiento man = new Mantenimiento();
        cel.recibirMantenimiento(man);
        comp.recibirMantenimiento(man);
        t.recibirMantenimiento(man);

    }

}