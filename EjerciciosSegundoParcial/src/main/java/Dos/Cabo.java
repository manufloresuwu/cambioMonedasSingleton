package Dos;

public class Cabo implements ICargo{

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
        if (tarea.equals("Limpiezas")) {
            System.out.println("Cabo se encarga de las limpiezas");
        } else {
            System.out.println("Cabo se encarga de las tareas restantes");
        }
    }

}
