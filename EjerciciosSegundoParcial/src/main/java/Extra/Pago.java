package Extra;

public class Pago implements IEncargado{

    private IEncargado next;

    @Override
    public void setNext(IEncargado encargado) {
        this.next = encargado;
    }

    @Override
    public IEncargado next() {
        return next;
    }

    @Override
    public void pagar(double monto, double prestamoInicial) {
        Cajero cajero = new Cajero();
        this.setNext(cajero);

        AgenteCredito agenteCredito = new AgenteCredito();
        cajero.setNext(agenteCredito);

        Supervisor supervisor = new Supervisor();
        agenteCredito.setNext(supervisor);

        Encargado encargado = new Encargado();
        supervisor.setNext(encargado);

        this.next.pagar(monto, Banco.getInstance().getPrestamoInicial());
    }

}
