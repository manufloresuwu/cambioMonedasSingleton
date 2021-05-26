public class Client {

    public static void main(String[] args) {

        String number = "1 2 3 4 5 6 7 8 9 10";

        InterpreterNumber interpreterEntero = new InterpreterNumber(number);
        System.out.println("Number:" + number);
        System.out.println("Roman:" + interpreterEntero.interpret());
    }

}
