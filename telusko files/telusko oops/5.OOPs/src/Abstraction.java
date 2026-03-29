public class Abstraction {
    public static void main(String[] args) {
        CargoPlane2 cargoPlane2 = new CargoPlane2();
        cargoPlane2.takeOff();
        cargoPlane2.fly();
        cargoPlane2.landing();
    }
}

abstract class Aeroplane2 {
    abstract void takeOff();
    abstract void landing();
    abstract public void fly();
}

class CargoPlane2 extends Aeroplane2 {
    public void takeOff() {
        System.out.println("cargo plane is taking off");
    }

    public void fly() {
        System.out.println("cargo plane is flying");
    }

    public void landing() {
        System.out.println("cargo plane is landing");
    }
}

class FighterPlane2 extends Aeroplane2 {
    public void takeOff() {
        System.out.println("fighter plane is taking off");
    }

    public void fly() {
        System.out.println("fighter plane is flying");
    }

    public void landing() {
        System.out.println("fighter plane is landing");
    }
}
