class A4{
    int a ,b;
    int c = 100;

    public A4(){
        a = 10;
        b = 20;
        System.out.println("zero para constructor a4");
    }

    public A4(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("two para constructor a4");
    }
}

class B4 extends A4{
    int x,y;
    int c = 50;

    public B4 (){
        x = 5;
        y = 7;
        System.out.println("zero para constructor b4");
    }
    public B4 (int x , int y){
        super(x+1,y+1);
        this.x = x;
        this.y = y;
        System.out.println("two para constructor b4");
    }
    void display(){
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("c of child class: " + this.c);
        System.out.println("c of parent class: " + super.c);
    }
}

public class Inheritance4 {
    public static void main(String[] args) {
//        B4 b = new B4(); (B4 is reference variable)
//        b.display();
        B4 b2 = new B4(4,6);
        b2.display();

    }
}
