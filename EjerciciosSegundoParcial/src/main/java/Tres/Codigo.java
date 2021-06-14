package Tres;

public class Codigo {

    private int version;
    private String codigo;
    public Codigo(int version, String codigo) {
        super();
        this.version = version;
        this.codigo = codigo;
    }
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void mostrarInfo() {
        System.out.println("Version: " + version);
        System.out.println("Codigo: " + codigo);
    }

}
