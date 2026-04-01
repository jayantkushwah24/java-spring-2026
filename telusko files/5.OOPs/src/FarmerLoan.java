import java.util.Scanner;

class LoanCalculator {

      float principal;
      float timeInYears;
      float rate;

    LoanCalculator(float principal, float timeInMonths, float rate) {
        this.principal = principal;
        this.timeInYears = timeInMonths / 12;
        this.rate = rate;
    }

    float calculateSimpleInterest() {
        return (principal * rate * timeInYears) / 100f;
    }
}

public class FarmerLoan {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the Loan Amount in INR: ");
            float principal = scanner.nextFloat();

            System.out.print("Enter loan duration in months: ");
            float timeInMonths = scanner.nextFloat();

            float rate = 9.8f;

            LoanCalculator loan = new LoanCalculator(principal, timeInMonths, rate);
            System.out.println("Simple Interest: " + loan.calculateSimpleInterest());
        }
    }
}
