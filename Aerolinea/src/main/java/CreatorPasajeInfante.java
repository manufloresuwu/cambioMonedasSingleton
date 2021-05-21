public class CreatorPasajeInfante extends CreatorPasaje{

    @Override
    public PasajeInfantes create(){

        Destino destino = new Destino();
        destino.setPais("Argentina");
        destino.setCiudad("Buenos Aires");
        destino.setAeropuerto("Aeropuerto de Buenos Aires");

        Origen origen = new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("La Paz");
        origen.setAeropuerto("Aeropuerto Nacional de El Alto");

        Avion avion = new Avion();
        avion.setMarca("Patito");
        avion.setCapacidad(900);
        avion.setModelo("17FR65");
        avion.setNroAsientos(890);

        Pasajero pasajero = new Pasajero();
        pasajero.setCi(9807690);
        pasajero.setNombre("Pepito Perez");

        PasajeInfantes pasaje = new PasajeInfantes();
        pasaje.setNroVuelo(456);
        pasaje.setDestino(destino);
        pasaje.setOrigen(origen);
        pasaje.setAvion(avion);
        pasaje.setPasajero(pasajero);
        pasaje.setNroAsiento(78);
        pasaje.setCostoEspecial(4500);
        return pasaje;

    }

}
