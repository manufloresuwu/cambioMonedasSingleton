package Tres;

import java.util.*;

public class Folder extends Disco{
    List<Disco> disco;

    public Folder() {
        disco = new LinkedList<Disco>();
    }

    @Override
    public int obtenerNumeroDePalabras() {
        int n = 0;
        for (Disco archivo : disco) {
            n += archivo.obtenerNumeroDePalabras();
        }
        palabras = n;
        return n;
    }

    @Override
    public void MostrarPalabras() {
        this.obtenerNumeroDePalabras();
        System.out.println("Numero de palabras: " + palabras);
    }

    @Override
    public void add(Disco component) {
        disco.add(component);
    }

    @Override
    public void remove(Disco component) {
        disco.remove(component);
    }

    @Override
    public void getChild(int position) {
        disco.get(position);
    }
}