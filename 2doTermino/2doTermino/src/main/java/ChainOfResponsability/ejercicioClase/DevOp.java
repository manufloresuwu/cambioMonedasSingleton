package ChainOfResponsability.ejercicioClase;

public class DevOp  implements ISoftware {

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
        if (resultado.equals("Infraestructura") ){
            System.out.println("DevOp: Info del error");
        } else {
            this.next.resultadoHandler(resultado);
        }
    }

}