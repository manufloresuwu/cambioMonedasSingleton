public class TermExpValue extends Abstract{

    @Override
    public void interpreter(Context context) {
        if (context.input.equals("Para [valor de la story]")){
            context.output = context.output + "Then [value story]";
            context.input = context.input.substring(1);
        }

    }

}
