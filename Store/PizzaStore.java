//use the facotry to make a pizza
public class PizzaStore {
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza orderPizza (String type){
        Pizza pizza = factory.createPizza(type);
        if (pizza == null){
            return null;
        }
    pizza.prepare ();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
    
    }
}