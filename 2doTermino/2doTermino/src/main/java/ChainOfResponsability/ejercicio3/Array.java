package ChainOfResponsability.ejercicio3;

public class Array implements IArray {
    private IArray next;

    @Override
    public void setNext(IArray handler) {
        this.next = handler;
    }

    @Override
    public IArray next() {
        return this.next;
    }

    @Override
    public void reparto(Persona persona) {

        A1 a1 = new A1();
        this.setNext(a1);

        A2 a2 = new A2();
        this.setNext(a2);

        A3 a3 = new A3();
        this.setNext(a3);

        this.next.reparto(persona);
    }
}
