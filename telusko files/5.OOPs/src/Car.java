public class Car{
    // below called attribute/fields/properties
    int speed ; //instance variable
    String brand = "tata";
    String color = "grey";

    Car(int s){
        this.speed = s;
    }

    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.speed = 100;
//        car1.run();
        Car car2 = new Car(100);
        car2.run();
    }
    // behavior / methods / actions
    public void run(){
        System.out.println("car is running at " + speed + " kmph");
    }
}