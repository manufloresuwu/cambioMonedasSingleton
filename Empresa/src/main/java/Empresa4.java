import java.util.Stack;
public class Empresa4 implements Lista{

    private Stack<String> nombres;

    public Empresa4() {
        nombres = new Stack<>();
    }

    public void add(String value) {
        nombres.add(value);
    }

    @Override
    public IteratorConcreteEmpresa4 iterator() {
        return new IteratorConcreteEmpresa4(this.nombres);
    }

}
