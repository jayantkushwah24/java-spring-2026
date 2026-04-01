public class Animal {

    void eat(){
        System.out.println("animal is eating");
    }

    void sound(){
        System.out.println("animal is making sound ");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("dog is barking..");
    }
}