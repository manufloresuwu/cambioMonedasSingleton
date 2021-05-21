public class Origen {

    private String pais;
    private String ciudad;
    private String aeropuerto;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public void mostrarInfo() {
        System.out.println("Informacion del Origen");
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Pais: " + pais);
        System.out.println("Aeropuerto: " + aeropuerto);
    }

}
