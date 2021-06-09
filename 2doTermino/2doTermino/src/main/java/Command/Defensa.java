package Command;

public class Defensa implements IAccion {
    private Personaje personaje;

    public Defensa(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.modoDefensa();
    }
}
