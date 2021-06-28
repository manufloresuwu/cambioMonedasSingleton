package Tres;

public abstract class Disco {
    int palabras;
    String contenido;

    public int obtenerNumeroDePalabras() {
        return palabras;
    }

    public void setPalabras(int palabras) {
        this.palabras = palabras;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenidos) {
        this.contenido = contenidos;
    }

    public abstract void MostrarPalabras();
    public abstract void add(Disco component);
    public abstract void remove(Disco component);
    public abstract void getChild(int position);
}