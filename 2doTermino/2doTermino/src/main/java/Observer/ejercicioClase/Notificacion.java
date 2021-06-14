package Observer.ejercicioClase;

public class Notificacion {

    private String categoria;
    private String contenido;

    public Notificacion(String categoria, String contenido) {
        this.categoria=categoria;
        this.contenido=contenido;

    }

    public void info(){
        System.out.println("INFO > categoria: ["+categoria+"]");
        System.out.println("INFO > contenido: " + categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
