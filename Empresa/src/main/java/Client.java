public class Client {

    public static void main(String[] args) {

        Empresa1 lista1 = new Empresa1();
        lista1.add("Pancracio");
        lista1.add("Camilo");
        lista1.add("Pilar");
        lista1.add("Gabriela");
        lista1.add("Sebastian");

        Empresa1 lista2 = new Empresa1();
        lista2.add("Edna");
        lista2.add("Cristina");
        lista2.add("Yolanda");
        lista2.add("Fabricio");

        Empresa3 lista3 = new Empresa3();
        lista3.add("Andalucia");
        lista3.add("Curtis");

        Empresa4 lista4 = new Empresa4();
        lista4.add("Simon");
        lista4.add("Laura");
        lista4.add("Rolando");
        lista4.add("Andrew");
        lista4.add("Dennis");

        Iterator iterator = lista1.iterator();
        while (iterator.hasNext()) {
            System.out.println("Nombre Empresa 1: " + iterator.next());
        }

        iterator = lista2.iterator();
        while (iterator.hasNext()) {
            System.out.println("Nombre Empresa 2: " + iterator.next());
        }

        iterator = lista3.iterator();
        while (iterator.hasNext()) {
            System.out.println("Nombre Empresa 3: " + iterator.next());
        }

        iterator = lista4.iterator();
        while (iterator.hasNext()) {
            System.out.println("Nombre Empresa 4: " + iterator.next());
        }

    }

}
