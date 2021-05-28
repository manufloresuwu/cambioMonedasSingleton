public class TermExpUser extends Abstract{


    @Override
    public void interpreter(Context context) {

            context.output= context.output + "Given [user]";
            context.input=context.input.substring(1);


    }

}
