import java.util.ArrayList;
import java.util.List;

public class Interpreter extends Expression{

    private List<Expression> parseTree = new ArrayList<>();
    private Context context;

    public Interpreter(String word) {
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context = new Context(input.replace(" ", ""));
        for (String word : input.split(" ")) {
            int numero = Integer.parseInt(word);
            if (numero <= 3) {
                parseTree.add(new TENumerosI());
            } else if (numero <= 8) {
                parseTree.add(new TENumerosV());
            } else if (numero <= 10) {
                parseTree.add(new TENumerosX());
            }

        }
    }

    public String interpretar() {
        for (Expression terminalExpresion : parseTree) {
            terminalExpresion.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {

    }

}
