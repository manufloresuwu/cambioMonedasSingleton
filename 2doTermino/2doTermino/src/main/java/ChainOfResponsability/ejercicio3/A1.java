package ChainOfResponsability.ejercicio3;

public class A1 implements IArray {
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
        if (persona.getEdad() > 1 && persona.getEdad() <= 20) {
            System.out.println("Se tiene hasta 20 años" );
        } else {
            this.next.reparto(persona);
        }
    }
}
