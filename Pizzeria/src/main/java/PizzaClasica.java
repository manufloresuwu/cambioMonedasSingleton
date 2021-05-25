public class PizzaClasica extends BuilderPizza {

    @Override
    public void buildIngredientes() {
        pizza.setIngredientes("salsa tomate, otro.");
    }

    @Override
    public void buildTipoMasa() {
        pizza.setTipoMasa("masa especial");
    }

    @Override
    public void buildTipoQueso() {
        pizza.setTipoQueso("doble quezo mozarella tipo2");
    }


}
