package Tres;

public class Cliente {
    public static void main(String[] args) {

        Disco d1 = new Archivo("cree en ti");
        Disco d2 = new Archivo("trabaja en ti");
        Disco d3 = new Archivo("queso");
        d1.MostrarPalabras();

        Disco d4 = new Archivo("brilla");
        Disco d5 = new Archivo("crece");
        Disco d6 = new Archivo("ama mucho ");
        d4.MostrarPalabras();

        Disco f1 = new Folder();
        f1.add(d1);
        f1.add(d2);
        f1.add(d3);
        f1.MostrarPalabras();

        Disco f2 = new Folder();
        f2.add(d4);
        f2.add(d5);
        f2.add(d6);
        f2.MostrarPalabras();

        Disco ud = new Folder();
        ud.add(f1);
        ud.add(f2);
        ud.MostrarPalabras();
    }
}