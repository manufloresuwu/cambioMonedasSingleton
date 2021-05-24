public class FactoryHelado {

    static Helado agua = new HeladoAgua();
    static Helado cremaH = new HeladoCrema();
    static Helado mixto = new HeladoMixto();

    enum helados {
        HeladoAgua, HeladoCrema, HeladoMixto;
    }

    public static Helado make(helados h) {

        switch (h) {

            case HeladoAgua: {

                ((HeladoAgua) agua).setTamanio("Pequeño");
                ((HeladoAgua) agua).setForma("Cuadrado");

                Base base = new Base();
                base.setCosto("5");
                base.setNombre("Cono");
                base.setTamanio("Mediano");
                base.setTipo("Cono");

                ((HeladoAgua) agua).setBase(base);

                Fruta fruta = new Fruta();
                fruta.setCosto("10");
                fruta.setNombre("Frutilla");
                fruta.setTamanio("Mediano");
                fruta.setTipoFruta("Dulce");

                ((HeladoAgua) agua).setFruta(fruta);

                return agua;
            }

            case HeladoCrema:{

                ((HeladoCrema) cremaH).setTamanio("Grande");
                ((HeladoCrema) cremaH).setForma("Triangular");

                Base base = new Base();
                base.setCosto("5");
                base.setNombre("Cono");
                base.setTamanio("Mediano");
                base.setTipo("Cono");

                ((HeladoCrema) cremaH).setBase(base);

                Fruta fruta = new Fruta();
                fruta.setCosto("10");
                fruta.setNombre("Uva");
                fruta.setTamanio("Mediano");
                fruta.setTipoFruta("Dulce");

                ((HeladoCrema) cremaH).setFruta(fruta);

                Crema crema = new Crema();
                crema.setCosto("15");
                crema.setMarca("Tentacion");
                crema.setSabor("Mora");

                ((HeladoCrema) cremaH).setCrema(crema);

                return cremaH;
            }

            case HeladoMixto:{

                ((HeladoMixto) mixto).setTamanio("Grande");
                ((HeladoMixto) mixto).setForma("Cuadrada");
                ((HeladoMixto) mixto).setCosto("20");

                Base base = new Base();
                base.setCosto("5");
                base.setNombre("Cono");
                base.setTamanio("Grande");
                base.setTipo("Vaso");

                ((HeladoMixto)mixto).setBase(base);

                Fruta fruta = new Fruta();
                fruta.setCosto("10");
                fruta.setNombre("Platano");
                fruta.setTamanio("Pequeño");
                fruta.setTipoFruta("Dulce");

                ((HeladoMixto)mixto).setFruta(fruta);

                Crema crema = new Crema();
                crema.setCosto("10");
                crema.setMarca("Rocky");
                crema.setSabor("Chocolate");

                ((HeladoMixto)mixto).setCrema(crema);

                return mixto;
            }

            default:
                return null;
        }
    }

}
