public class TermExpAction extends Abstract{

    @Override
    public void interpreter(Context context) {
        if (context.input.equals("Quiero [accciones]")){
            context.output= context.output + "When [actions]";
            context.input=context.input.substring(1);
        }
    }

}
