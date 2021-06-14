package Extra;

public class Supervisor implements IEncargado{

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
        if (Banco.getInstance().getPrestamo() > 0.1) {
            System.out.println("Recibiendo pagos");
            Banco.getInstance().pagarDeuda(monto);
        } else {
            next.pagar(monto, prestamoInicial);
        }
    }

}
