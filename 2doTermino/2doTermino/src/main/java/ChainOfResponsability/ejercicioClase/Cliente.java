package ChainOfResponsability.ejercicioClase;

public class Cliente {

    public static void main(String[] args) {
        HandlerManager hm = new HandlerManager();
        hm.resultadoHandler("Bug");
        System.out.println("******************************");
        hm.resultadoHandler("Mejora");
        System.out.println("******************************");
        hm.resultadoHandler("Nueva funcionalidad");
        System.out.println("******************************");
        hm.resultadoHandler("Infraestructura");
        System.out.println("******************************");
        hm.resultadoHandler("Costos");

    }

}
