public class Static2 {
    public static void main(String[] args) {
        System.out.println("main method");
    }
    static int a ;
    static {
        a=10;
        display();
    }
    public static void display(){
        System.out.println(a);
        System.out.println("static method");
    }

}
