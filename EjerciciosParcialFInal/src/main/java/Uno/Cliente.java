package Uno;

public class Cliente {

    public static void main(String[] args) {

        IPersonaje j1 = new Personaje("Svartalla");
        j1.info();
        j1 = new Jugador(j1, "Escopeta");
        j1.info();
        j1 = new Escudo(j1);
        j1.info();
        j1 = new Posion(j1);
        j1.info();
    }

}

