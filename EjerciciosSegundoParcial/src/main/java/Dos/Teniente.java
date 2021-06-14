package Dos;

public class Teniente implements ICargo{

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
        if (tarea.equals("Disciplina")) {
            System.out.println("Teniente esta cumpliendo con la disciplina");
        } else {
            this.next.tarea(tarea);
        }
    }

}
