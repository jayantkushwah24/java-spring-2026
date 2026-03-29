interface Calculator{
    public abstract void add(int a, int b);
    void subtract(int a, int b); // public abstract is default here ,dont need to write
}
interface Calculator2{
    void multiply(int a, int b);
    void divide(int a, int b);
}


class MyCalculator1 implements Calculator , Calculator2{
    public void add(int a , int b){
        int result = a + b;
        System.out.println(result);
    }
    public void subtract(int a , int b){
        int result = a - b;
        System.out.println(result);
    }
    public void multiply(int a , int b){
        int result = a * b;
        System.out.println(result);
    }
    public void divide(int a , int b){
        int result = a / b;
        System.out.println(result);
    }
}

abstract class MyCalculator2 implements Calculator{
    public void add(int a , int b){
        int result ;
        int num1 = a;
        int num2 = b;
        result = num1 + num2;
        System.out.println(result);
    }
//    public void subtract(int a , int b){
//        int result ;
//        int num1 = a;
//        int num2 = b;
//        result = num1 - num2;
//        System.out.println(result);
//    }
}


 interface Demo1{
    void display();
}
//interface Demo2 implements Demo1{} // ['implements' not allowed on interface]
interface Demo2 extends Demo1{}

public class Interface1 {
    public static void main(String[] args) {
        MyCalculator1 myCalculator1 = new MyCalculator1();
        myCalculator1.add(34 , 435);
        myCalculator1.subtract(2334 , 435);
        myCalculator1.multiply(34 , 5);
        myCalculator1.divide(22 , 11);
    }
}
