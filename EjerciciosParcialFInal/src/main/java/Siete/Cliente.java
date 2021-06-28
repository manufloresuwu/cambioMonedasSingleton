package Siete;

public class Cliente {

    public static void main(String[] args) {

        Duenios presidente = new Presidente("Cristian");
        Duenios vicePresidente = new VicePresidente("Nicole");
        Duenios contador = new Contabilidad("Ignacio");

        Cuenta cuenta = Cuenta.getInstance();
        cuenta.addDueno(presidente);
        cuenta.addDueno(vicePresidente);
        cuenta.addDueno(contador);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                cuenta.pagar(cuenta.repararComputador(new PC(42, "Asus TUF Gaming")));
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                cuenta.pagar(cuenta.repararComputador(new Tablet(16, "iPad 10th Gen")));

            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                cuenta.pagar(cuenta.repararComputador(new Laptop(27, "HP Pavilion Gaming")));

            }
        });

        thread1.run();
        thread2.run();
        thread3.run();

    }

}