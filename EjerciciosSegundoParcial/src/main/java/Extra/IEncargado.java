package Extra;

public interface IEncargado {

    void setNext(IEncargado cobrante);
    IEncargado next();
    void pagar(double monto,double prestamoInicial);

}
