class Person{
    int age ;

    void display(){
        age = 26;
        System.out.println("Age : " + age + " years");
    }
}

class Child extends Person{

}

public class Inheritance1 {
    public static void main(String[] args) {

//        Person p = new Person();
//        p.display();
        Child c = new Child();
        c.display();

    }
}
