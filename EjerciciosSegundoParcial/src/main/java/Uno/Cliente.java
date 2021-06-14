package Uno;

public class Cliente {

    public static void main(String[] args) {

        Versiones versiones = new Versiones();
        Originator originator = new Originator();

        Tesis t;

        t = new Tesis("12/1/2021", "Esta es mi primera version");
        originator.setState(t);
        versiones.addMemento(originator.createVersion());

        t = new Tesis("12/2/2021", "Esta es mi segunda version");
        originator.setState(t);
        versiones.addMemento(originator.createVersion());

        t = new Tesis("12/3/2021", "Esta es mi tercera version");
        originator.setState(t);
        versiones.addMemento(originator.createVersion());

        t = new Tesis("12/4/2021", "Esta es mi cuarta version");
        originator.setState(t);
        versiones.addMemento(originator.createVersion());

        t = new Tesis("12/5/2021", "Esta es mi quinta version");
        originator.setState(t);
        versiones.addMemento(originator.createVersion());

        originator.restoreFromMemento(versiones.getVersion(2));

    }

}
