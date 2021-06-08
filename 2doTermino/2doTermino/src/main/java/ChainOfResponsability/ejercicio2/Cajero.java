package ChainOfResponsability.ejercicio2;

public class Cajero implements ISoftware {
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

        if ( persona.getFicha()&persona.getCertificadoNacimiento()& (!persona.getPagoBanco())){
            System.out.println("Cajero: Proceda a cancelar el pago");
            persona.setPagoBanco(true);
            this.next.resultadoHandler(persona);
        } else {
            this.next.resultadoHandler(persona);
        }
    }

}
