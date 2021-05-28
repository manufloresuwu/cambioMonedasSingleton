import java.util.Vector;
public class Empresa3 implements Lista{

    private Vector<String> nombres;

    public Empresa3() {
        nombres = new Vector<>();
    }

    public void add(String value) {
        nombres.add(value);
    }

    @Override
    public IteratorConcreteEmpresa3 iterator() {
        return new IteratorConcreteEmpresa3(this.nombres);
    }

}
