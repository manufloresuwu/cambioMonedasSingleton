public class Usuario {

    public static void main(String[] args) {

        Banco banco = new Banco();
        CasaCambio casaCambio = new CasaCambio();
        Librecambista librecambista = new Librecambista();

        banco.BolivianoADolar(6);
        casaCambio.EuroADolar(39.87);
        librecambista.BolivianoAEuro(769);
    }

}
