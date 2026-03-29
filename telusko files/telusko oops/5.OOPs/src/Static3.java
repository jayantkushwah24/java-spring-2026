class Student2{
    int id;
    String name;
    String city;
    int count ;
    {count++;}

    Student2(){
        System.out.println("zero para constructor");
    }

    Student2(int id,String name , String city){
        this.id = id;
        this.name = name;
        this.city = city;
    }
}

public class Static3 {
    public static void main(String[] args) {
        Student2 student1 = new Student2(1,"jayant","dhar");
        Student2 student2 = new Student2(2,"mahi","indore");
    }
}
