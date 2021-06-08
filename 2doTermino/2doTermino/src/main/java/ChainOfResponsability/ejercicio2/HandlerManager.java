package ChainOfResponsability.ejercicio2;

public class HandlerManager implements ISoftware {
    private ISoftware next;

    @Override
    public void setNext(ISoftware handler) {
        this.next=handler;
    }

    @Override
    public ISoftware next() {
        return this.next;
    }

    @Override
    public void resultadoHandler(Persona persona) {
        AyudaCliente ayudaCliente = new AyudaCliente();
        this.setNext(ayudaCliente);

        Notario notario = new Notario();
        ayudaCliente.setNext(notario);

        Cajero cajero = new Cajero();
        notario.setNext(cajero);

        Carnetizacion carnetizacion = new Carnetizacion();
        cajero.setNext(carnetizacion);



        this.next.resultadoHandler(persona);
    }
}
