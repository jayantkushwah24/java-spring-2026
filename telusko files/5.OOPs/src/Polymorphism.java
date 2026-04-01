class Aeroplane1{
    public void takeOff(){
        System.out.println("aeroplane is taking off ");
    }
    public void landing(){
        System.out.println("aeroplane is landing");
    }
    public void fly(){
        System.out.println("aeroplane is flying");
    }
}
class CargoPlane1 extends Aeroplane1{
    public void takeOff(){
        System.out.println("cargo plane is taking off");
    }
    public void fly(){
        System.out.println("cargo plane is flying");
    }
}

class FighterPlane1 extends Aeroplane1{
    public void takeOff(){
        System.out.println("fighter plane is taking off");
    }
    public void fly(){
        System.out.println("fighter plane is flying");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
//        Aeroplane1 cp = new CargoPlane1();
//        cp.takeOff();
//        cp.landing();
//        ((CargoPlane1) cp).fly();
//
//        System.out.println("***********************");
//
//        Aeroplane1 fp = new FighterPlane1();
//        fp.takeOff();
//        fp.landing();
//        ((FighterPlane1) fp).fly();

        CargoPlane1 cargoPlane1 = new CargoPlane1();
        FighterPlane1 fighterPlane1 = new FighterPlane1();

        Aeroplane1 aeroplane1;

        aeroplane1 = cargoPlane1;

        aeroplane1.takeOff();
        aeroplane1.landing();
        aeroplane1.fly();

        System.out.println("**********************");

        aeroplane1 = fighterPlane1;

        aeroplane1.takeOff();
        aeroplane1.landing();
        aeroplane1.fly();

    }
}
