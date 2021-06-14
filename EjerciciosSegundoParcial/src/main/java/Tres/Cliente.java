package Tres;

public class Cliente {

    public static void main(String[] args) {

        Commit commit = new Commit();
        Originator originator = new Originator();

        Codigo c;

        c = new Codigo(1, "for");
        originator.setState(c);
        commit.addMemento(originator.createVersion());

        c = new Codigo(2, "if");
        originator.setState(c);
        commit.addMemento(originator.createVersion());

        c = new Codigo(3, "while");
        originator.setState(c);
        commit.addMemento(originator.createVersion());

        c = new Codigo(4, "dowhile");
        originator.setState(c);
        commit.addMemento(originator.createVersion());

        c = new Codigo(5, "+");
        originator.setState(c);
        commit.addMemento(originator.createVersion());

        Desarrollador d1 = new Desarrollador("Luis");
        Desarrollador d2 = new Desarrollador("Adrian");
        Desarrollador d3 = new Desarrollador("Jose");

        originator.attach(d1);
        originator.attach(d2);
        originator.attach(d3);

        originator.restoreFromMemento(commit.getVersion(0));

        originator.deattach(d1);
        originator.deattach(d2);
        originator.deattach(d3);

        Desarrollador d4 = new Desarrollador("Ximena");
        Desarrollador d5 = new Desarrollador("Sofia");
        Desarrollador d6 = new Desarrollador("Carolina");

        originator.attach(d4);
        originator.attach(d5);
        originator.attach(d6);

        originator.restoreFromMemento(commit.getVersion(4));

    }

}
