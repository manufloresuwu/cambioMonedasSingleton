package Dos;

public class Cliente {

    public static void main(String[] args) {

        IInstalacion iag1 = new Agua("Agua", 80, new Efectivo());
        IInstalacion iag2 = new Agua("Agua", 80, new Transferencia());
        IInstalacion iag3 = new Agua("Agua", 80, new TigoMoney());
        IInstalacion iag4 = new Agua("Agua", 80, new Aplicacion());
        iag1.pagar();
        iag2.pagar();
        iag3.pagar();
        iag4.pagar();

        IInstalacion ial1 = new Alcantarillado("Ductos", 200, new Efectivo());
        IInstalacion ial2 = new Alcantarillado("Ductos", 200, new Transferencia());
        IInstalacion ial3 = new Alcantarillado("Ductos", 200, new TigoMoney());
        IInstalacion ial4 = new Alcantarillado("Ductos", 200, new Aplicacion());
        ial1.pagar();
        ial2.pagar();
        ial3.pagar();
        ial4.pagar();

        IInstalacion ie1 = new Electrica("Electricidad", 100, new Efectivo());
        IInstalacion ie2 = new Electrica("Electricidad", 100, new Transferencia());
        IInstalacion ie3 = new Electrica("Electricidad", 100, new TigoMoney());
        IInstalacion ie4 = new Electrica("Electricidad", 100, new Aplicacion());
        ie1.pagar();
        ie2.pagar();
        ie3.pagar();
        ie4.pagar();

    }

}