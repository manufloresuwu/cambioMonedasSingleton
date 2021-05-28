public class Client {

    public static void main(String[] args) {
        String entrada = "Como [usuario]";

        Interpreter interpreter = new Interpreter(entrada);
        System.out.println(entrada);
        System.out.println(interpreter.interpretar());
    }

}
