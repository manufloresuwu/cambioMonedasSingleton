import java.util.Stack;
public class IteratorConcreteEmpresa4 implements Iterator{

    private Stack<String> nombres;
    private int position;

    public IteratorConcreteEmpresa4(Stack<String> nombres) {
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
