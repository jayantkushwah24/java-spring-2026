public class MethodOverloading {
    public static void main(String[] args) {
        AdditionOfNumber add = new AdditionOfNumber();
        int ans = add.add(34,56);
        System.out.println(ans);
    }


}

class AdditionOfNumber{
     int add(int num1,int num2){
         return num1 + num2;
     }

     int add(int num1,int num2,int num3){
         return num1 + num2 + num3;
     }
     double add(int num1,double num2,double num3){
         return num1 + num2 + num3;
     }

}