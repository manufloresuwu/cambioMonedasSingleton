package Command;

public class Atacar implements IAccion {

    private Personaje personaje;

    public Atacar(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.atacar();
    }

}
