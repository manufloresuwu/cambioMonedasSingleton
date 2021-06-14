package Extra;

public class Banco {

    private static Banco instance = null;
    private double prestamo;
    private double prestamoInicial;

    private Banco() {
        prestamo= 3400;
        System.out.println("INFO> Iniciando Prestamo "+prestamo);
    }

    public static synchronized void makeInstance() {
        if (instance == null)
            instance = new Banco();
    }

    public static Banco getInstance() {
        if (instance == null)
            makeInstance();
        return instance;
    }

    public synchronized double pagarDeuda(double amount) {
        prestamo-=amount;
        System.out.println("Su deuda es: "+prestamo);
        return prestamo;
    }

    public synchronized double getPrestamo() {
        return prestamo;
    }
    public synchronized double getPrestamoInicial() {
        return prestamoInicial;
    }
    public synchronized void setPrestamoInicial(double prestamo) {
        this.prestamoInicial= prestamo;
    }

}
