public class Librecambista {

    public double BolivianoADolar(double monto) {
        double total = CantidadCambio.getInstance().CantidadCambiada(monto, "BolivianoADolar");
        if(total < 1){
            System.out.println("> El monto es: "+ total +" dolar");
        } else {
            System.out.println("> El monto es: "+ total +" dolares");
        }
        return total;
    }

    public double DolarABoliviano(double monto) {
        double total = CantidadCambio.getInstance().CantidadCambiada(monto, "DolarABoliviano");
        if(total < 1){
            System.out.println("> El monto es: "+ total +" boliviano");
        } else {
            System.out.println("> El monto es: "+ total +" bolivianos");
        }
        return total;
    }

    public double BolivianoAEuro(double monto) {
        double total = CantidadCambio.getInstance().CantidadCambiada(monto, "BolivianoAEuro");
        if(total < 1){
            System.out.println("> El monto es: "+ total +" euro");
        } else {
            System.out.println("> El monto es: "+ total +" euros");
        }
        return total;
    }

    public double EuroABoliviano(double monto) {
        double total = CantidadCambio.getInstance().CantidadCambiada(monto, "EuroABoliviano");
        if(total < 1){
            System.out.println("> El monto es: "+ total +" boliviano");
        } else {
            System.out.println("> El monto es: "+ total +" bolivianos");
        }
        return total;
    }

    public double DolarAEuro(double monto) {
        double total = CantidadCambio.getInstance().CantidadCambiada(monto, "DolarAEuro");
        if(total < 1){
            System.out.println("> El monto es: "+ total +" euro");
        } else {
            System.out.println("> El monto es: "+ total +" euros");
        }
        return total;
    }
    public double EuroADolar(double monto) {
        double total = CantidadCambio.getInstance().CantidadCambiada(monto, "EuroADolar");
        if(total < 1){
            System.out.println("> El monto es: "+ total +" dolar");
        } else {
            System.out.println("> El monto es: "+ total +" dolares");
        }
        return total;
    }

}
