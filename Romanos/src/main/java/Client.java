public class Client {

    public static void main(String[] args) {

        String input = "1 2 3 4 5 6 7 8 9 10";

        Interpreter interpreter = new Interpreter(input);
        System.out.println("ejem1: " + interpreter.interpretar());

        String input1 = "7 8 2 3 9 10 1";

        Interpreter interpreter1 = new Interpreter(input1);
        System.out.println("ejem2: " + interpreter1.interpretar());
    }

}
