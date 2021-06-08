package ChainOfResponsability.ejercicio2;

public class Carnetizacion implements ISoftware {
    private ISoftware next;

    @Override
    public void setNext(ISoftware software) {
        this.next=software;
    }

    @Override
    public ISoftware next() {
        return this.next;

    }

    @Override
    public void resultadoHandler(Persona persona) {
        if (persona.getCertificadoNacimiento()&&persona.getFicha()&& persona.getPagoBanco() ){
            System.out.println("Carnetizacion: Realizando carnet");
        } else {
            this.next.resultadoHandler(persona);
        }
    }

}
