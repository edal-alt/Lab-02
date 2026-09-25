public class GreekPizza extends Pizza {
    public GreekPizza () {
        setName("Greek Pizza");
    }
    @Override
    public void prepare (){
        System.out.println("Prepare Greek Pizza");
    }
    @Override
    public void bake () {
        System.out.println("Bake Greek Pizza");
    }
    @Override
    public void cut(){
        System.out.println("Cut Greek Pizza");
    }
    @Override
    public void box(){
        System.out.println("Box Greek Pizza");
    }
}

//extends pizza
//construct that sats name = "Cheese Pizza"
//Four @override methods that each just pring what that