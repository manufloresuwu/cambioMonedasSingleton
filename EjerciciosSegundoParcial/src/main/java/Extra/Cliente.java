package Extra;

public class Cliente {

    public static void main(String[] args) {
        Pago p = new Pago();
        Banco.getInstance().setPrestamoInicial(3400);
        p.pagar(250, 3400);
        p.pagar(250, 3400);
        p.pagar(250, 3400);
        p.pagar(250, 3400);
        p.pagar(250, 3400);
        p.pagar(250, 3400);
        p.pagar(250, 3400);
        p.pagar(250, 3400);
        p.pagar(250, 3400);
        p.pagar(250, 3400);
    }

}
