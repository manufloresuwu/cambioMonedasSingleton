public class HeladoMixto extends Helado {

    public String tamanio;
    public String forma;
    public String costo;
    public Fruta fruta;
    public Base base;
    public Crema crema;

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

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
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

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
    }

    public HeladoMixto() {

        fruta = new Fruta();
        base = new Base();
        crema = new Crema();
    }

    @Override
    public void crear() {
        System.out.println("Tamaño del helado mixto: " + tamanio);
        System.out.println("Forma del helado mixto: " + forma);
        System.out.println("Costo del helado mixto: " + costo);

        System.out.println("Sabor de la Crema: " + crema.getSabor());
        System.out.println("Costo (Crema): " + crema.getCosto());
        System.out.println("Marca (Crema): " + crema.getMarca());

        System.out.println("Nombre de la Base: " + base.getNombre());
        System.out.println("Tamaño (Base): " + base.getTamanio());
        System.out.println("Tipo (Base): " + base.getTipo());
        System.out.println("Costo (Base): " + base.getCosto());

        System.out.println("Tipo de Fruta: " + fruta.getTipoFruta());
        System.out.println("Fruta: " + fruta.getNombre());
        System.out.println("Costo (Fruta): " + fruta.getCosto());
        System.out.println("Tamaño (Fruta): " + fruta.getTamanio());
    }

}
