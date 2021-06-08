package Mediator;

public class Cliente {

    public static void main(String[] args) {
        Skype skype = new Skype();

        DEV dev1 = new DEV(skype, "Cristian", 6758940, "C++");
        DEV dev2 = new DEV(skype, "Lucifer", 233445102, "JavaScript");
        DEV dev3 = new DEV(skype, "Amenadiel", 128903, "Matlab");

        QA qa1 = new QA(skype, "Ermendrer", 35478290, "Phd");
        QA qa2 = new QA(skype, "Ignacio", 24357901, "Phd");
        QA qa3 = new QA(skype, "Indiana", 234514, "Phd");

        SM sm1 = new SM(skype, "Teodoro", 76758901, 7);
        SM sm2 = new SM(skype, "Carlos", 546798, 9);
        SM sm3 = new SM(skype, "Arelis", 65743212, 12);

        skype.addCollegue(dev1);
        skype.addCollegue(dev2);
        skype.addCollegue(dev3);

        skype.addCollegue(qa1);
        skype.addCollegue(qa2);
        skype.addCollegue(qa3);

        skype.addCollegue(sm1);
        skype.addCollegue(sm2);
        skype.addCollegue(sm3);

        dev1.send("Prueba DEV");
        dev2.send("Prueba DEV");
        dev3.send("Prueba DEV");

        qa1.send("Prueba QA");
        qa2.send("Prueba QA");
        qa3.send("Prueba QA");

        sm1.send("Prueba SM");
        sm2.send("Prueba SM");
        sm3.send("Prueba SM");
    }

}
