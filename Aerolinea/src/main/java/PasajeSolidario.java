public class PasajeSolidario implements IPasaje{

    public int nroVuelo;
    public Destino destino;
    public Origen origen;
    public Avion avion;
    public Pasajero pasajero;
    public int nroAsiento;
    public int costoPasaje;
    public int descuento;
    public String motivoDescuento;

    public PasajeSolidario(){
        destino=new Destino();
        origen = new Origen();
        avion = new Avion();
        pasajero=new Pasajero();
    }

    public int getNroVuelo() {
        return nroVuelo;
    }

    public void setNroVuelo(int nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public int getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(int costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.motivoDescuento = motivoDescuento;
    }

    @Override
    public void crear(){
        System.out.println("Informacion del Pasaje (Solidario)");
        System.out.println("Numero de vuelo: " + nroVuelo);
        System.out.println("Asiento: " + nroAsiento);
        System.out.println("Costo del pasaje: " + costoPasaje);
        System.out.println("Descuento: " + descuento);
        System.out.println("Motivo del descuento: " + motivoDescuento);

        destino.mostrarInfo();
        origen.mostrarInfo();
        avion.mostrarInfo();
        pasajero.mostrarInfo();
    }

}
