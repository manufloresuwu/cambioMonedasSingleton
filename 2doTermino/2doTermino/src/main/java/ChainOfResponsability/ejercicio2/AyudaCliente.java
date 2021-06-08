package ChainOfResponsability.ejercicio2;

public class AyudaCliente implements ISoftware {
    private ISoftware next;

    @Override
    public void setNext(ISoftware responsable) {
        this.next = responsable;
    }

    @Override
    public ISoftware next() {
        return this.next;

    }

    @Override
    public void resultadoHandler(Persona persona) {
        if (!persona.getFicha()){
            System.out.println("Atencion al cliente: Se requiere: Certificado de nacimiento, pago al banco y ficha");
        }else {
            this.next.resultadoHandler(persona);
        }

    }

}
