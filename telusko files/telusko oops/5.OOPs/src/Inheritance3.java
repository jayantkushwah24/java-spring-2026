class Parent3{
    Parent3(){
        System.out.println("parent class constructor");
    }
}
class Child3 extends Parent3{
    Child3(){
        System.out.println("child class constructor");
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        Child3 child3 = new Child3();
    }
}
