class Animal1{
    private int a = 100;
    public int getA(){
        return this.a;
    }

    void sleep(){
        System.out.println("animal is sleeping");
    }
    public void eat(){
        System.out.println("animal are required to eat");
    }
}

class Tiger extends Animal1{
    protected void sleep(){// can increase the visibility while overriding inherited methods
        System.out.println("tiger is sleeping");
    }
//    private void eat(){ // but can't reduce the visibility while overriding inherited methods
//        System.out.println("tiger hunts and eat");
//    }
//    public int eat(){ //the primitive return type can't be changeed
//        return 10;
//    }
    public void running(){
        System.out.println("tiger is running to hunt");
    }
}

public class Inheritance5 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.getA();
    }
}
