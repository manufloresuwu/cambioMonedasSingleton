package ChainOfResponsability.ejercicio3;

public class A3 implements IArray {
    private  IArray next;

    @Override
    public void setNext(IArray handler) {
        this.next=handler;
    }

    @Override
    public IArray next() {
        return this.next;
    }

    @Override
    public void reparto (Persona persona) {
        if (persona.getEdad() > 50) {
            System.out.println("Se tiene 50 años para adelante" );
        } else {
            this.next.reparto(persona);
        }
    }
}
