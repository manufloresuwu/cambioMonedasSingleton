package Uno;

public class Posion implements IPersonaje {
    IPersonaje personaje;

    public Posion(IPersonaje personaje) {
        this.personaje = personaje;
        this.aumentarRegeneracion(80);
    }

    @Override
    public String nombre() {

        return personaje.nombre();
    }

    @Override
    public int nivel() {
        return personaje.nivel();
    }

    @Override
    public void subirNivel(int niveles) {
        personaje.subirNivel(niveles);

    }

    @Override
    public String armas() {
        return personaje.armas();
    }

    @Override
    public void equiparArma(String arma) {
        personaje.subirNivel(personaje.nivel());

    }

    @Override
    public int porcentajeArmadura() {
        return personaje.porcentajeArmadura();
    }

    @Override
    public void aumentarArmadura(int porcentaje) {
        personaje.aumentarArmadura(porcentaje);
    }

    @Override
    public int puntosAtaque() {
        return personaje.puntosAtaque();
    }

    @Override
    public void aumentarAtaque(int puntos) {
        personaje.aumentarAtaque(puntos);
    }

    @Override
    public int puntosDefensa() {
        return personaje.puntosDefensa();
    }

    @Override
    public void aumentarDefensa(int puntos) {
        personaje.aumentarDefensa(puntos);
    }

    @Override
    public int puntosRegeneracion() {
        return personaje.puntosRegeneracion();
    }

    @Override
    public void aumentarRegeneracion(int puntos) {
        personaje.aumentarRegeneracion(puntos);
    }

    @Override
    public void info() {
        System.out.println("***Se ha equipado una posion***");
        personaje.info();
    }

}