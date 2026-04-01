public class ATM {
    String accountHolderName ;
    double balance;

    ATM(String name , double bal ){
        this.accountHolderName = name;
        this.balance = bal;
    }
    public static void main(String[] args) {
        ATM atm = new ATM("Jayant" , 1000000);
        atm.showBalance();
    }

    public void showBalance(){
        System.out.println("Your current balance is : " + balance);
    }
}
