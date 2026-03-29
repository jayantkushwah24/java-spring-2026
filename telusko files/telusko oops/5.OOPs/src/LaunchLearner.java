class Learner{
    private int id;
    private String name;
    private String city;

    Learner(int id , String name , String city){
        this.id = id;
        this.name = name;
        this.city = city;
    }

//    Learner(){ // always zero parametrized
//        super();
//    }  // bts this default constructor will be included by compiler only if dev doesn't code a constructor

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city; // this refers to the current object whose method or constructor is being executed.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getId(){
        return id;
    }

    void setId(int id){
        this.id = id;
    }
}

public class LaunchLearner {
    public static void main(String[] args) {
        Learner learner = new Learner(1,"jayant" , "dhar");
        learner.setId(1);
        int id = learner.getId();
        System.out.println("Id = " + id);
    }
}
