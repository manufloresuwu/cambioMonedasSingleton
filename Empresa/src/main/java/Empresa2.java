import java.util.List;

public class Empresa2 implements Lista {

    private String[] nombres;
    private int position;

    public Empresa2() {
        position = 0;
        nombres = new String[5];
    }

    public void add(String value) {
        nombres[position] = value;
        position++;
    }

    @Override
    public IteratorConcreteEmpresa2 iterator() {
        return new IteratorConcreteEmpresa2(this.nombres);
    }

}
