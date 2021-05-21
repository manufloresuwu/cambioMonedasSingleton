public class Cliente {

    public static void main(String[] args) {

        CreatorPasaje pasaje1 = new CreatorPasajeInfante();

        PasajeInfantes pasajeInfante1 = (PasajeInfantes) pasaje1.create();
        Pasajero p1 = new Pasajero();
        p1.setNombre("Juana Azurduy");
        p1.setCi(6574990);
        pasajeInfante1.setNroAsiento(67);
        pasajeInfante1.setPasajero(p1);

        PasajeInfantes pasajeInfante2 = (PasajeInfantes) pasaje1.create();
        Pasajero p2 = new Pasajero();
        p2.setNombre("Carlos Paez");
        p2.setCi(6583904);
        pasajeInfante2.setNroAsiento(789);
        pasajeInfante2.setPasajero(p2);

        pasajeInfante1.crear();
        pasajeInfante2.crear();

        CreatorPasaje pasaje2 = new CreatorPasajeStandar();

        PasajeStandar pasajeStandart1 = (PasajeStandar) pasaje2.create();
        Pasajero p3 = new Pasajero();
        p3.setNombre("Chespirito Bolanios");
        p3.setCi(759609);
        pasajeStandart1.setNroAsiento(87);
        pasajeStandart1.setPasajero(p3);

        PasajeStandar pasajeStandart2 = (PasajeStandar) pasaje2.create();
        Pasajero p4 = new Pasajero();
        p4.setNombre("Donia Florinda");
        p4.setCi(64859);
        pasajeStandart2.setNroAsiento(6);
        pasajeStandart2.setPasajero(p4);

        pasajeStandart1.crear();
        pasajeStandart2.crear();

        CreatorPasaje pasaje3 = new CreatorPasajeSolidario();

        PasajeSolidario pasajeSolidario1 = (PasajeSolidario) pasaje3.create();
        Pasajero p5 = new Pasajero();
        p5.setNombre("Horacio Gomez");
        p5.setCi(658930050);
        pasajeSolidario1.setNroAsiento(2);
        pasajeSolidario1.setPasajero(p5);

        PasajeSolidario pasajeSolidario2 = (PasajeSolidario) pasaje3.create();
        Pasajero p6 = new Pasajero();
        p5.setNombre("Cashmir Nieto");
        p5.setCi(8799);
        pasajeSolidario1.setNroAsiento(11);
        pasajeSolidario1.setPasajero(p6);

        pasajeSolidario1.crear();
        pasajeSolidario2.crear();

    }

}
