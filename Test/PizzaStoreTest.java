import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaStoreTest {

    @Test
    public void testOrderPepperoni(){

        PizzaStore store = new PizzaStore (new PizzaFactory());
        Pizza pizza = store.orderPizza("pepperoni");
        assertEquals("Pepperoni Pizza", pizza.getName());
    }
    @Test
    public void testOrderOliveOil(){

        PizzaStore store = new PizzaStore (new PizzaFactory());
        Pizza pizza = store.orderPizza("olive oil");
        assertEquals(null, pizza);
    }

    @Test
    public void testGlutenFreePizza(){

        PizzaStore store = new PizzaStore (new PizzaFactory());
        Pizza pizza = store.orderPizza("glutenfree");
        assertEquals("Gluten Free Pizza", pizza.getName());
    }
}