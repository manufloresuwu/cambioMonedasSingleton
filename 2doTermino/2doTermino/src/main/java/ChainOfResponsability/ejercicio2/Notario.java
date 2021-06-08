package ChainOfResponsability.ejercicio2;

public class Notario implements ISoftware {
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
    public void resultadoHandler(Persona persona) {

        if (persona.getPagoBanco() && persona.getFicha() && (!persona.getCertificadoNacimiento())){
            System.out.println("Notario: En un momento se le entregara el certificado");
            persona.setCertificadoNacimiento(true);
            this.next.resultadoHandler(persona);
        } else {
            this.next.resultadoHandler(persona);
        }
    }

}
