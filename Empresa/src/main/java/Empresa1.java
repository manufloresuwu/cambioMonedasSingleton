import java.util.ArrayList;
import java.util.List;
public class Empresa1 implements Lista{

    private List<String> nombres;

    public Empresa1() {
        nombres = new ArrayList<>();
    }

    public void add(String value) {
        nombres.add(value);
    }

    @Override
    public IteratorConcreteEmpresa1 iterator() {
        return new IteratorConcreteEmpresa1(this.nombres);
    }

}