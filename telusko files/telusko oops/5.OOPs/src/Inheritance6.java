class Parent1{
 static int a = 100;
 static void display(){
     System.out.println("static method in Parent class");
 }
}

class Child1 extends Parent1{
    static int a = 200;
    // we can inherit static method but can not override
    // below method will hide/dominate parent class static method and behave like specialized method
    static void display(){
        System.out.println("static method in child class");
    }
}

public class Inheritance6 {
    public static void main(String[] args) {
        System.out.println(Child1.a);
        Child1.display();
        System.out.println(Parent1.a);
    }
}
