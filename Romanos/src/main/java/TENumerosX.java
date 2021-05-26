public class TENumerosX extends Expression{

    @Override
    public void interpreter(Context context) {
        int x = Integer.parseInt(context.input.substring(0, 1));
        if (x == 9) {
            context.output = context.output + "IX";
        } else {
            context.input = context.input.substring(1);
            context.output = context.output + "X";

        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);
    }

}
