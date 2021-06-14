package Dos;

public class Cadena implements ICargo{

    private ICargo next;

    @Override
    public void setNext(ICargo iCargo) {
        this.next = iCargo;
    }

    @Override
    public ICargo next() {
        return next;
    }

    @Override
    public void tarea(String tarea) {
        General general = new General();
        this.setNext(general);

        Teniente teniente = new Teniente();
        general.setNext(teniente);

        Coronel coronel = new Coronel();
        teniente.setNext(coronel);

        Cabo cabo = new Cabo();
        coronel.setNext(cabo);

        this.next.tarea(tarea);
    }

}
