class Aeroplane //extend Object class 
{
    void fly(){
        System.out.println("aeroplane flies");
    }
    void landing(){
        System.out.println("plane is landing");
    }
}
class CargoPlane extends Aeroplane{
    // over ridden method
    void fly(){
        System.out.println("cargoplane files");
    }
    //specialized method
    void loading(){
        System.out.println("cargo plane is getting loaded");
    }
}
class PassengerPlane extends Aeroplane{
    void fly() {
        System.out.println("passenger plane files");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Aeroplane aeroplane = new Aeroplane();
        CargoPlane cargoPlane = new CargoPlane();
        PassengerPlane passengerPlane = new PassengerPlane();
        aeroplane.fly();
        cargoPlane.fly();
        passengerPlane.fly();
        //inherited methods
        cargoPlane.landing();
    }
}
