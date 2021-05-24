public class HeladoAgua extends Helado {

    public String tamanio;
    public String forma;
    public Fruta fruta;
    public Base base;

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public HeladoAgua() {

        fruta = new Fruta();
        base = new Base();

    }

    @Override
    public void crear() {
        System.out.println("Tamaño del helado mixto: " + tamanio);
        System.out.println("Forma del helado mixto: " + forma);

        System.out.println("Nombre de la Base:" + base.getNombre());
        System.out.println("Tamaño (Base):" + base.getTamanio());
        System.out.println("Tipo (Base):" + base.getTipo());
        System.out.println("Costo (Base):" + base.getCosto());

        System.out.println("Tipo de la Fruta: " + fruta.getTipoFruta());
        System.out.println("Nombre (Fruta): " + fruta.getNombre());
        System.out.println("Costo (Fruta): " + fruta.getCosto());
        System.out.println("Tamaño (Fruta): " + fruta.getTamanio());
    }


}
