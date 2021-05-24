public class Cliente {

    public static void main(String[] args) {

        HeladoAgua agua1 = (HeladoAgua) FactoryHelado.make(FactoryHelado.helados.HeladoAgua);
        HeladoAgua agua2 = (HeladoAgua) FactoryHelado.make(FactoryHelado.helados.HeladoAgua);
        HeladoAgua agua3 = (HeladoAgua) FactoryHelado.make(FactoryHelado.helados.HeladoAgua);

        HeladoCrema crema1 = (HeladoCrema) FactoryHelado.make(FactoryHelado.helados.HeladoCrema);
        HeladoCrema crema2 = (HeladoCrema) FactoryHelado.make(FactoryHelado.helados.HeladoCrema);
        HeladoCrema crema3 = (HeladoCrema) FactoryHelado.make(FactoryHelado.helados.HeladoCrema);

        HeladoMixto mixto1 = (HeladoMixto) FactoryHelado.make(FactoryHelado.helados.HeladoMixto);
        HeladoMixto mixto2 = (HeladoMixto) FactoryHelado.make(FactoryHelado.helados.HeladoMixto);
        HeladoMixto mixto3 = (HeladoMixto) FactoryHelado.make(FactoryHelado.helados.HeladoMixto);

        // VARIACIONES AL HELADO POR DEFAULT
        agua1.setTamanio("Pequeño");
        agua1.setForma("Cuadrada");

        agua2.setTamanio("Mediano");
        agua2.setForma("Triangular");

        agua3.setTamanio("Grande");
        agua3.setForma("Redonda");

        crema1.setTamanio("Pequeño");
        crema1.setForma("Cuadrada");

        crema2.setTamanio("Mediano");
        crema2.setForma("Redonda");

        crema3.setTamanio("Grande");
        crema3.setForma("Triangular");

        mixto1.setTamanio("Pequeño");
        mixto1.setForma("Cuadrada");

        mixto2.setTamanio("Mediano");
        mixto2.setForma("Cuadrada");

        mixto3.setTamanio("Grande");
        mixto3.setForma("Triangular");


        agua1.crear();
        agua2.crear();
        agua3.crear();
        crema1.crear();
        crema2.crear();
        crema3.crear();
        mixto1.crear();
        mixto2.crear();
        mixto3.crear();

    }

}
