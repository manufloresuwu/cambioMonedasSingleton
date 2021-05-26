public class TENumerosI extends Expression {

    @Override
    public void interpreter(Context context) {
        int r = Integer.parseInt(context.input.substring(0, 1));
        for (int i = 0; i < r; i++) {
            context.output = context.output + "I";
        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);
    }

}
