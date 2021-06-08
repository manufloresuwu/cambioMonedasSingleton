package ChainOfResponsability.ejercicioClase;

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
    public void resultadoHandler(String resultado) {

        DevOp devOp = new DevOp();
        this.setNext(devOp);

        QA qa = new QA();
        devOp.setNext(qa);

        Developer dev = new Developer();
        qa.setNext(dev);

        Finanzas fin = new Finanzas();
        dev.setNext(fin);

        Support sup = new Support();
        fin.setNext(sup);

        this.next.resultadoHandler(resultado);
    }


}
