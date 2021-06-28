package Siete;

import java.util.*;

public class Cuenta {
    int monto;
    static List<Duenios> dueno;

    public static Cuenta instance = null;

    private Cuenta() {
        dueno = new LinkedList<Duenios>();
        monto = 0;
    }

    public synchronized static void addDueno(Duenios nuevoDueno) {
        dueno.add(nuevoDueno);
    }

    private synchronized static void makeInstace() {
        if (instance == null)
            instance = new Cuenta();
    }

    public static Cuenta getInstance() {
        if (instance == null)
            makeInstace();
        return instance;
    }

    public synchronized int repararComputador(Computadora computadora) {
        ServicioReparacion servicioReparacion = new ServicioReparacion();
        int precio = computadora.recivirReparacion(servicioReparacion);
        System.out.println("Se cobrarán: " + precio + "bs por el servicio");
        return precio;

    }

    public synchronized void pagar(int monto) {
        this.monto += monto;
        System.out.println("Se recibio el pago, el nuevo monto en cuenta es: " + monto + "bs");
        Notificacion nt = new Notificacion();
        for (Duenios d : dueno) {
            nt.addDueno(d);
        }
        nt.enviar("Se ha recibido el monto de " + monto + "bs");
    }

}