package ChainOfResponsability.ejercicioClase;

public class QA implements ISoftware {
    private ISoftware next;

    @Override
    public void setNext(ISoftware encargado) {
        this.next=encargado;
    }

    @Override
    public ISoftware next() {
        return this.next;

    }

    @Override
    public void resultadoHandler(String resultado) {
        if (resultado.equals("Bug") ||  resultado.equals("Mejora")){
            System.out.println("QA: Resolviendo error");
        } else {
            this.next.resultadoHandler(resultado);
        }
    }

}