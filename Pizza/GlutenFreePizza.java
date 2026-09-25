public class GlutenFreePizza extends Pizza {
    public GlutenFreePizza () {
        setName("Gluten Free Pizza");
    }
    @Override
    public void prepare (){
        System.out.println("Prepare Gluten Free Pizza");
    }
    @Override
    public void bake () {
        System.out.println("Bake Gluten Free Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cut Gluten Free Pizza");
    }
    @Override
    public void box(){
        System.out.println("Box Gluten Free Pizza");
    }
}

//extends pizza
//construct that sats name = "Cheese Pizza"
//Four @override methods that each just pring what that