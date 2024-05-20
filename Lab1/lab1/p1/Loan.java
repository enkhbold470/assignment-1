/*
Your Name: Enkhbold Ganbold
Class and Section: CIS35A
Assignment Number: Assignment1
Due Date: April.24
Date Submitted: April.22
 */
import java.util.Scanner;

public class Loan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double loanAmount;
        int numberOfYears;
        double annualInterestRate;
        do {
            System.out.print("Loan Amount: ");
            loanAmount = scanner.nextDouble();
            if (loanAmount <= 0) {
                System.out.println("Error: Loan amount must be positive.");
            }
        } while (loanAmount <= 0);
        do {
            System.out.print("Number Of Years: ");
            numberOfYears = scanner.nextInt();
            if (numberOfYears <= 0) {
                System.out.println("Error: Number of years must be positive.");
            }
        } while (numberOfYears <= 0);
        do {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextDouble();
            if (annualInterestRate <= 0) {
                System.out.println("Error: Interest rate must be positive.");
            }
        } while (annualInterestRate <= 0);
        double monthlyInterestRate = annualInterestRate / (12 * 100);
        int numberOfPayments = numberOfYears * 12;
        double monthlyPayment = calculateMonthlyPayment(loanAmount, monthlyInterestRate, numberOfPayments);
        System.out.println("\nPayment#\tInterest\t\tPrincipal\t\tBalance");
        double balance = loanAmount;
        for (int i = 1; i <= numberOfPayments; i++) {
            double interest = balance * monthlyInterestRate;
            double principal = monthlyPayment - interest;
            balance = balance - principal;
            if (i == numberOfPayments && Math.abs(balance) < 0.01) {
                principal += balance;
                balance = 0.0;
            }
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, principal, balance);
        }
        double totalPayment = monthlyPayment * numberOfPayments;
        System.out.printf("\nTotal Payment: %.2f\n", totalPayment);
    }
    public static double calculateMonthlyPayment(double loanAmount, double monthlyInterestRate, int numberOfPayments) {
        double numerator = loanAmount * monthlyInterestRate;
        double denominator = 1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments);
        return numerator / denominator;
    }
}
