public class TENumerosV extends Expression{

    @Override
    public void interpreter(Context context) {
        int x = Integer.parseInt(context.input.substring(0,1));
        if (x == 4) {
            context.output = context.output + "IV";
        } else {
            context.output = context.output + "V";
            for (int i = 0; i < x - 5; i++) {
                context.output = context.output + "I";
            }
        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);
    }

}
