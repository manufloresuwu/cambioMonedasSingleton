public class PizzaHawaiana extends BuilderPizza {

    @Override
    public void buildIngredientes() {
        pizza.setIngredientes("piña, salsa tomate, otro.");
    }

    @Override
    public void buildTipoMasa() {
        pizza.setTipoMasa("masa normal");
    }

    @Override
    public void buildTipoQueso() {
        pizza.setTipoQueso("quezo mozarella tipo2");
    }

}
