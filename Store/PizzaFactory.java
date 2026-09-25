//take an order word "cheese" and hand it over to the right pizza object
//one method 
public class PizzaFactory{

    public Pizza createPizza(String type){
        if (type == null) {
            return null;
        }
        if (type.equals("cheese")){
            return new CheesePizza();
        }
        else if (type.equals("glutenfree")){
            return new GlutenFreePizza();
        }
        else if (type.equals("greek")){
            return new GreekPizza();
        }
        else if (type.equals("pepperoni")){
            return new PepperoniPizza();
        }
        return null;
    }
}