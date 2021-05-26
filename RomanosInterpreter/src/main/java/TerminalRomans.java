public class TerminalRomans extends AbstractNumber {

    public TerminalRomans(int number) {
        this.number=number;
    }

    @Override
    public void interpreter(ContextNumber context) {

        if (context.input.startsWith("I")) {
            context.aux = -1;
            context.input = context.input.substring(this.number);
        }

    }

}
