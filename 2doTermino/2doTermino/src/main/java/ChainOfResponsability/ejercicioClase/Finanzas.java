package ChainOfResponsability.ejercicioClase;

public class Finanzas implements ISoftware {
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
        if (resultado.equals("Precios") ){
            System.out.println("Finanzas: Se esta analizando");
        } else {
            this.next.resultadoHandler(resultado);
        }
    }

}