package Dos;

public class Coronel implements ICargo{

    private ICargo next;

    @Override
    public void setNext(ICargo iCargo){
        this.next = iCargo;
    }

    @Override
    public ICargo next(){
        return next;
    }

    @Override
    public void tarea(String tarea){
        if (tarea.equals("Desbloqueos")) {
            System.out.println("Coronel esta atendiendo los desbloqueos");
        } else {
            this.next.tarea(tarea);
        }
    }

}
