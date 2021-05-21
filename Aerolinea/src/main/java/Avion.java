public class Avion {

    private String marca;
    private int capacidad;
    private String modelo;
    private int nroAsientos;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNroAsientos() {
        return nroAsientos;
    }

    public void setNroAsientos(int nroAsientos) {
        this.nroAsientos = nroAsientos;
    }

    public void mostrarInfo(){
        System.out.println("Informacion del Avion");
        System.out.println("Marca: " + marca);
        System.out.println("Capacidad (personas): " + capacidad);
        System.out.println("Modelo: " + modelo);
        System.out.println("Numero de asientos: " + nroAsientos);

    }

}
