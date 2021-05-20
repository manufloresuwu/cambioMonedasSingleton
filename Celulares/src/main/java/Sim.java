public class Sim {
    private String empresa;
    private int numeroTelefono;

    public Sim (String empresa, int numeroTelefono) {
        this.empresa = empresa;
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}