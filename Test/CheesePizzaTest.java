import org.junit.Test;
import static org.junit.Assert.*;

public class CheesePizzaTest {
    @Test
    public void testName(){
        CheesePizza pizza = new CheesePizza();
        assertEquals("Cheese Pizza", pizza.getName());
    }


    @Test
    public void testSetName(){
        CheesePizza pizza = new CheesePizza();
        pizza.setName("cheese");
        assertEquals("cheese", pizza.getName());
    }

    @Test
    public void testNullName(){
        CheesePizza pizza = new CheesePizza();
        pizza.setName(null);
        assertEquals(null, pizza.getName());
    }

    @Test 
    public void testPrepare(){
        CheesePizza pizza = new CheesePizza();
        pizza.prepare();
    }


    @Test 
    public void testBake(){
        CheesePizza pizza = new CheesePizza();
        pizza.bake();
    }

    @Test 
    public void testCut(){
        CheesePizza pizza = new CheesePizza();
        pizza.cut();
    }

    @Test 
    public void testBox(){
        CheesePizza pizza = new CheesePizza();
        pizza.box();
    }
}