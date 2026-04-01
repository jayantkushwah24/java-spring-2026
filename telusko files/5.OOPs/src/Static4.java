class Alien{
    static {
        System.out.println("sb1");
    }
    static {
        System.out.println("sb2");
    }
    {
        System.out.println("nsb1");
    }
    {
        System.out.println("nsb2");
    }
    static int a = 10;

    public static void display(){
        System.out.println(a);
    }
}

public class Static4 {
    public static void main(String[] args) {
        Alien alien = new Alien();
//        Alien.display();
//        Alien alien2 = new Alien();
    }
}
