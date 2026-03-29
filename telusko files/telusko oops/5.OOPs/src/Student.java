public class Student {
    String name;
    int age;
    int id;

    public static void main(String[] args) {
        Student student = new Student(); // instantiation of a class
        student.studying();
    }
    void playing(){
        System.out.println("student is playing");
    }

    void studying(){
        System.out.println("Student is studying");
    }

}
