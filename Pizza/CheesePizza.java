public class CheesePizza extends Pizza {
    public CheesePizza () {
        setName("Cheese Pizza");
    }
    @Override
    public void prepare (){
        System.out.println("Prepare Cheese Pizza");
    }
    @Override
    public void bake () {
        System.out.println("Bake Cheese Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cut Cheese Pizza");
    }
    @Override
    public void box(){
        System.out.println("Box Cheese Pizza");
    }
}

//extends pizza
//construct that sats name = "Cheese Pizza"
//Four @override methods that each just pring what that