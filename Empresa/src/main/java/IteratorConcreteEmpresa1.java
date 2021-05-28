import java.util.List;
public class IteratorConcreteEmpresa1 implements Iterator{

    private List<String> nombres;
    private int position;

    public IteratorConcreteEmpresa1(List<String> nombres) {
        this.nombres = nombres;
    }

    @Override
    public Object next() {
        return nombres.get(position++);
    }

    @Override
    public boolean hasNext() {
        return nombres.size() != 0 && position < nombres.size();
    }

}
