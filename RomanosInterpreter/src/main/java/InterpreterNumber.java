import java.util.ArrayList;
import java.util.List;
public class InterpreterNumber extends AbstractNumber {

    private List<AbstractNumber> parseTree= new ArrayList<>();
    private ContextNumber context;

    public InterpreterNumber(String word){
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context= new ContextNumber(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "1":
                    parseTree.add(new TerminalNaturals(word.length()));
                    break;
                case "I":
                    parseTree.add(new TerminalNaturals(word.length()));
                    break;
                default:
                    parseTree.add(new TerminalNaturals(word.length()));
                    break;
            }

        }
    }


    public String interpret(){
        for (AbstractNumber terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }



    @Override
    public void interpreter(ContextNumber context) {

    }

}
