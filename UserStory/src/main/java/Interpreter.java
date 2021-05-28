import java.util.ArrayList;
import java.util.List;
public class Interpreter extends Abstract{

    private List<Abstract> parseTree= new ArrayList<>();
    private Context context;

    public Interpreter(String word){
        this.interpretacion(word);
    }

    public void interpretacion(String words) {
        String input = words;
        context= new Context(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "Como [usuario]":
                    parseTree.add(new TermExpUser());
                    break;
                case "Quiero [accciones]":
                    parseTree.add(new TermExpAction());
                    break;
                case "Para [valor de la story]":
                    parseTree.add(new TermExpValue());
                    break;
                default:
                    break;
            }

        }
    }


    public String interpretar(){
        for (Abstract terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }

    public void interpreter(Context context) {

    }

}
