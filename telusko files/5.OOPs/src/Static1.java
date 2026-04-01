class Demo{
    static int a, b, c;
    int x,y,z;

    static {
        System.out.println("Static initialised block");
        a = 20;
        b= 40;
        c = 80;
    }
    static void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class Static1 {
    public static void main(String[] args) {
        Demo.display();
    }
}
