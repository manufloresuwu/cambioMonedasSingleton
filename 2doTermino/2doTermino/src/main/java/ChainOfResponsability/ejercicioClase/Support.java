package ChainOfResponsability.ejercicioClase;

public class Support implements ISoftware {
    private ISoftware next;

    @Override
    public void setNext(ISoftware encargado) {
        this.next = encargado;
    }

    @Override
    public ISoftware next() {
        return this.next;

    }

    @Override
    public void resultadoHandler(String resultado) {
        System.out.println("Support: Evaluando error");
    }

}
