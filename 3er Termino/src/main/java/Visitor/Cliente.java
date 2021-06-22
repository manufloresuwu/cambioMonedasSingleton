package Visitor;

public class Cliente {

    public static void main(String []sss){

        Notepad notepad = new Notepad();
        Word word = new Word();
        Sublime sublime = new Sublime();

        notepad.setContenido("Las humintas me encantan");
        word.setContenido("Hola Mundo");
        sublime.setContenido("Patrones de disenio");

        Visitor visitor1 = new Visitor();
        notepad.accept(visitor1);
        sublime.accept(visitor1);
        word.accept(visitor1);

    }

}
