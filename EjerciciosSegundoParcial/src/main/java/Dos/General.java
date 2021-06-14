package Dos;

public class General implements ICargo{

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
        if (tarea.equals("Entrevistas")) {
            System.out.println("General esta realizando entrevistas");
        } else {
            this.next.tarea(tarea);
        }
    }

}
