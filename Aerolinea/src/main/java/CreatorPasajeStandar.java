public class CreatorPasajeStandar extends CreatorPasaje{

    @Override
    public PasajeStandar create(){

        Destino destino = new Destino();
        destino.setPais("Colombia");
        destino.setCiudad("Bogota");
        destino.setAeropuerto("Aeropuerto de Bogota");

        Origen origen = new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("Santa Cruz");
        origen.setAeropuerto("Aeropuerto Nacional Viru Viru");

        Avion avion = new Avion();
        avion.setMarca("Osito");
        avion.setCapacidad(400);
        avion.setModelo("178OOR65");
        avion.setNroAsientos(890);

        Pasajero pasajero = new Pasajero();
        pasajero.setCi(8567676);
        pasajero.setNombre("Pancracio Gomez");

        PasajeStandar pasaje = new PasajeStandar();
        pasaje.setNroVuelo(78);
        pasaje.setDestino(destino);
        pasaje.setOrigen(origen);
        pasaje.setAvion(avion);
        pasaje.setPasajero(pasajero);
        pasaje.setNroAsiento(321);
        pasaje.setCostoPasaje(7500);
        return pasaje;

    }

}
