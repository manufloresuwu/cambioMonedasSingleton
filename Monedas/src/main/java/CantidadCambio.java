public class CantidadCambio {

    private static CantidadCambio instance = null;
    private double BolivianoADolar;
    private double DolarABoliviano;
    private double BolivianoAEuro;
    private double EuroABoliviano;
    private double DolarAEuro;
    private double EuroADolar;

    private CantidadCambio() {
        BolivianoADolar = 0.15;
        DolarABoliviano = 6.96;
        BolivianoAEuro = 0.12;
        EuroABoliviano = 8.43;
        DolarAEuro = 0.82;
        EuroADolar = 1.22;
    }

    public static synchronized void makeInstance() {
        if (instance == null)
            instance = new CantidadCambio();
    }

    public static CantidadCambio getInstance() {
        if (instance == null)
            makeInstance();
        return instance;
    }

    public double CantidadCambiada(double monto, String tipoCambio) {
        if (tipoCambio.equals("DolarABoliviano")) {
            return DolarABoliviano * monto;
        } else if (tipoCambio.equals("BolivianoADolar")) {
            return BolivianoADolar * monto;
        } else if (tipoCambio.equals("DolarAEuro")) {
            return DolarAEuro * monto;
        } else if (tipoCambio.equals("EuroADolar")) {
            return EuroADolar * monto;
        } else if (tipoCambio.equals("EuroABoliviano")) {
            return EuroABoliviano * monto;
        } else if (tipoCambio.equals("BolivianoAEuro")) {
            return BolivianoAEuro * monto;
        } else
            return 0;
    }

}
