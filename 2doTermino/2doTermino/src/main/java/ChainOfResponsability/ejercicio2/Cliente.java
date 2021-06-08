package ChainOfResponsability.ejercicio2;

public class Cliente {

    public static void main(String[] args) {
        HandlerManager handlerManager = new HandlerManager();

        handlerManager.resultadoHandler(new Persona(true, true, true));
        System.out.println("******************************");
        handlerManager.resultadoHandler(new Persona(false, false, false));
        System.out.println("******************************");
        handlerManager.resultadoHandler(new Persona(true, false, true));
        System.out.println("******************************");


    }
}