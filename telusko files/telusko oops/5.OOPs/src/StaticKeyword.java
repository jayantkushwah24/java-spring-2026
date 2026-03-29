class StaticVariable{
    static int a , b , c;
    int x , y , z;

    static {
        System.out.println("static initialization block");
        a = 10;
        b = 20;
        c = 30;
    }

    static void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    {
        x = 44;
        y = 45;
        z = 46;
        System.out.println("java initialization block");
    }
        void display2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        StaticVariable.display(); //static method dont need object , can be invoked via class name
        // static component of class are object independent
        StaticVariable sv = new StaticVariable();
        sv.display2();
        // when does java initialization block get executed ? During object creation , before constructor execution.
    }
}
