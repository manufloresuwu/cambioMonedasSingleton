public class CreatorPasajeSolidario extends CreatorPasaje{

    @Override
    public PasajeSolidario create(){

        Destino destino = new Destino();
        destino.setPais("Peru");
        destino.setCiudad("Lima");
        destino.setAeropuerto("Aeropuerto de Lima");

        Origen origen = new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("Oruro");
        origen.setAeropuerto("Aeropuerto Nacional de El Alto");

        Avion avion = new Avion();
        avion.setMarca("Quesito");
        avion.setCapacidad(400);
        avion.setModelo("R6456YT");
        avion.setNroAsientos(1200);

        Pasajero pasajero = new Pasajero();
        pasajero.setCi(7462908);
        pasajero.setNombre("Paz Italiana");

        PasajeSolidario pasaje = new PasajeSolidario();
        pasaje.setNroVuelo(678);
        pasaje.setDestino(destino);
        pasaje.setOrigen(origen);
        pasaje.setAvion(avion);
        pasaje.setPasajero(pasajero);
        pasaje.setNroAsiento(34);
        pasaje.setCostoPasaje(7500);
        pasaje.setDescuento(1000);
        pasaje.setMotivoDescuento("Falta de Audicion");
        return pasaje;

    }


}
