package Command;

public class Cliente {

    public static void main(String[] args) {
        Personaje personaje = new Personaje();

        Atacar atacar = new Atacar(personaje);
        Defensa defensa = new Defensa(personaje);
        Disparar disparar = new Disparar(personaje);

        Invoker comando = new Invoker();
        comando.addCommand(disparar);
        comando.addCommand(defensa);
        comando.addCommand(atacar);

        comando.executeCommands();
    }

}
