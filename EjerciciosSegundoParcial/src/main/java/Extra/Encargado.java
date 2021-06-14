package Extra;

public class Encargado implements IEncargado{

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
        System.out.println("Devolviendo documentos");

    }


}
