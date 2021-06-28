package Seis;

import java.util.*;

public class Mantenimiento implements IMantenimiento {

    @Override
    public void mantenimiento(Celular celular) {
        celular.mostrarInfo();
        System.out.println("Se recomienda un mantenimiento preventivo para el celular");

    }

    @Override
    public void mantenimiento(Computadora computadora) {
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(100) + 1;
        if (numeroAleatorio % 2 == 0) {
            System.out.println("Se recomienda un mantenimiento preventido para la computadora");
        } else {
            System.out.println("Se recomienda un mantenimiento correctivo para la computadora");
        }
    }

    @Override
    public void mantenimiento(Televisor televisor) {
        System.out.println("Imprimiendo caracteristicas");
        televisor.mostrarInfo();
    }

}
