public class TerminalNaturals extends AbstractNumber {

    public TerminalNaturals(int number) {
        this.number=number;
    }

    @Override
    public void interpreter(ContextNumber context) {

        if (context.input.startsWith("1")) {
            context.aux = -1;
            context.input = context.input.substring(this.number);
        }

    }

}
