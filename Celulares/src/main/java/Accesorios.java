public class Accesorios {

    private boolean audifono;
    private boolean cargador;
    private boolean estuche;

    public Accesorios(boolean audifono, boolean cargador, boolean estuche) {
        this.cargador = cargador;
        this.estuche = estuche;
        this.audifono = audifono;
    }

    public boolean getAudifono() {
        return audifono;
    }
    public void setAudifono(boolean audifono) {
        this.audifono = audifono;
    }
    public boolean getCargador() {
        return cargador;
    }
    public void setCargador(boolean cargador) {
        this.cargador = cargador;
    }
    public boolean getEstuche() {
        return estuche;
    }
    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }

}