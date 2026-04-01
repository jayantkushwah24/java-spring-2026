class Constructor{
    private int num1;
    private int num2;

    Constructor(){
        super(); // go to parent class and come back
        num1 = 1;
        num2 = 2;
        System.out.println("zero para constructor");
    }

    Constructor(int num1 ){
        this(); // call the zero para constructor of same class
        this.num1 = num1;
        this.num2 = 2;
        System.out.println("one para constructor");
    }

    Constructor(int num1 , int num2){
        this(num1); // call the one para constructor of same class
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("two para constructor");
    }

    void display(){
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Constructor constructor = new Constructor(60);
        constructor.display();
        System.out.println("------------------------");
        Constructor constructor2 = new Constructor(60,100);
        constructor2.display();

    }
}
