package Extra;

public class Cajero implements IEncargado{

    private IEncargado next;

    @Override
    public void setNext(IEncargado encargado) {
        next = encargado;
    }

    @Override
    public IEncargado next() {
        return next;
    }

    @Override
    public void pagar(double monto, double prestamoInicial) {
        double prestamoActual = Banco.getInstance().getPrestamo() - monto;
        if ((prestamoInicial - prestamoActual) < prestamoInicial / 4) {
            System.out.println("Procesando pago...");
            Banco.getInstance().pagarDeuda(monto);
        } else {
            next.pagar(monto, prestamoInicial);
        }
    }

}
