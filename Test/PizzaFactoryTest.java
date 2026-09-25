import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaFactoryTest{

    @Test
    public void testpfact(){
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("greek");
        if (pizza.getName().equals("Greek Pizza")){
            assertEquals(true, true);
        }
        else{
            assertEquals(false, true);
        }
    }

    @Test
    public void testhawaiian(){
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("hawaiian");
        assertEquals(null, pizza);
        }

    @Test

    public void testCheese(){
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("cheese");
        if (pizza.getName().equals("Cheese Pizza")){
            assertEquals(true, true);
        }
        else{
            assertEquals(false, true);
        }
    }
}