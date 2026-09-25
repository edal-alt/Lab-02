import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaTest{

    @Test

    public void testGetName() {
        Pizza pizza = new PepperoniPizza();
        if (pizza.getName().equals ("Pepperoni Pizza")){
            assertEquals(true, true);
        }
        else{
            assertEquals(false, true);
        }
    }

    @Test

    public void testSetName() {
        Pizza pizza = new CheesePizza();
        pizza.setName("T1");
        if (pizza.getName().equals ("T1")){
           assertEquals(true, true);
            }
        else{
            assertEquals(false, true);

        }
}

    @Test
    
    public void ChangeName() {
        Pizza pizza = new GlutenFreePizza();
        pizza.setName("No Sugar Pizza");
        if (pizza.getName().equals ("No Sugar Pizza")){
                assertEquals(true, true);
        }
        else{
        assertEquals(false, true);
        }
    }
}

