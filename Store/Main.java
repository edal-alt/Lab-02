//runs the program
public class Main {
    public static void main(String[] args){
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        store.orderPizza("cheese");
        System.out.println();
        store.orderPizza("greek");
        System.out.println();
        store.orderPizza("pepperoni");
        System.out.println();
        store.orderPizza("glutenfree");
    }
}