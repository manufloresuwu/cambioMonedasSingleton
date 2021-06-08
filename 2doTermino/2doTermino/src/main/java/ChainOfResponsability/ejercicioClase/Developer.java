package ChainOfResponsability.ejercicioClase;

public class Developer implements ISoftware {

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
        if (resultado.equals("Nueva funcionalidad") ){
            System.out.println("Developer: Nueva funcionalidad");
        } else {
            this.next.resultadoHandler(resultado);
        }
    }

}