package ChainOfResponsability.ejercicio2;

public class Persona {

    private Boolean certificadoNacimiento;
    private Boolean pagoBanco;
    private Boolean ficha;

    public Persona(Boolean certificadoNacimiento, Boolean pagoBanco, Boolean ficha) {
        this.certificadoNacimiento = certificadoNacimiento;
        this.pagoBanco = pagoBanco;
        this.ficha = ficha;
    }

    public Boolean getCertificadoNacimiento() {
        return certificadoNacimiento;
    }

    public void setCertificadoNacimiento(Boolean certificadoNacimiento) {
        this.certificadoNacimiento = certificadoNacimiento;
    }

    public Boolean getPagoBanco() {
        return pagoBanco;
    }

    public void setPagoBanco(Boolean pagoBanco) {
        this.pagoBanco = pagoBanco;
    }

    public Boolean getFicha() {
        return ficha;
    }

    public void setFicha(Boolean ficha) {
        this.ficha = ficha;
    }

    public void showInfo(){
        System.out.println("Certificado de Nacimiento: " + certificadoNacimiento);
        System.out.println("Pago al Banco: " + pagoBanco);
        System.out.println("Ficha: " + ficha);
    }

}
