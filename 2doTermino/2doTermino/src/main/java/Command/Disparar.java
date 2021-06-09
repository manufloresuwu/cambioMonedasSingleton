package Command;

public class Disparar implements IAccion {
    private Personaje personaje;

    public Disparar(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.disparar();
    }
}