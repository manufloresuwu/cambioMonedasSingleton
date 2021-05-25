public class Cliente {

    public static void main(String[] args) {

        Dueno manu = new Dueno();

        PizzaClasica pizzaClasica = new PizzaClasica();
        PizzaHawaiana pizzaHawaiana = new PizzaHawaiana();
        PizzaCarnivora pizzaCarnivora = new PizzaCarnivora();

        System.out.println("----------------------");
        manu.setBuilderPizza(pizzaClasica);
        manu.cocinarPizza();
        manu.getPizza().mostrarInfo();
        System.out.println("----------------------");
        manu.setBuilderPizza(pizzaCarnivora);
        manu.cocinarPizza();
        manu.getPizza().mostrarInfo();
        System.out.println("----------------------");
        manu.setBuilderPizza(pizzaHawaiana);
        manu.cocinarPizza();
        manu.getPizza().mostrarInfo();
    }

}
