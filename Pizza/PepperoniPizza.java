public class PepperoniPizza extends Pizza {
    public PepperoniPizza () {
        setName("Pepperoni Pizza");
    }
    @Override
    public void prepare (){
        System.out.println("Prepare Pepperoni Pizza");
    }
    @Override
    public void bake () {
        System.out.println("Bake Pepperoni Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cut Pepperoni Pizza");
    }
    @Override
    public void box(){
        System.out.println("Box Pepperoni Pizza");
    }
}

//extends pizza
//construct that sats name = "Cheese Pizza"
//Four @override methods that each just pring what that