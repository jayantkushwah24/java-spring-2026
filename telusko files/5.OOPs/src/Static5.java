class StaticDemo5{
    static {
        display();
    }

    static int a = 10;

    public static void display(){
        System.out.println(a);
    }
}

public class Static5 {
    public static void main(String[] args) {
//        StaticDemo5 sd5 = new StaticDemo5();
//        sd5.display();
        StaticDemo5.display();
    }

}
