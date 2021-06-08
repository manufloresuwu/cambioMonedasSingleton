package ChainOfResponsability.ejercicio3;

public class A2 implements IArray {
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
        if (persona.getEdad() > 20 && persona.getEdad() <= 50) {
            System.out.println("Se tiene entre 20 y 50 años" );
        } else {
            this.next.reparto(persona);
        }
    }
}
