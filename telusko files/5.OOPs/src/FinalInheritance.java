//we cant inherit final class
//final class Plane{}

class Plane{
    final int a = 100; // final variable behave like constant
    final public void fly(){
        System.out.println("plane is flying");
    }

}
//Cannot inherit from final class 'Plane'
class FighterPlane extends Plane{
    //'fly()' cannot override 'fly()' in 'Plane'; overridden method is final
//    public void fly(){
//        System.out.println("figher plane is flying");
//    }

}

public class FinalInheritance {
    public static void main(String[] args) {
        FighterPlane fighterPlane = new FighterPlane();
        // we can inherit final method from parent class to child class
        fighterPlane.fly();
    }
}
