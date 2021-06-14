package State.ejercicioClase;

public class ProgramasAbiertos {

    private int numero=0;

    String[] Programas=new String[20];
    int random = (int)(Math. random()*10+1);

    public void listaProgramas() {
        for (int i = 0; i <= random - 1; i++) {
            Programas[i] = "Programa" + i;
        }
    }

    public ProgramasAbiertos(int numero){
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String [] getListaProgramas(){
        return Programas;
    }
}
