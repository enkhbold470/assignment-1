/*
 * Class Design: SavingsAccount.java
 * 
 * Packages: SavingsAccountPackage
 * Variables: private static double annualInterestRate, private double savingsBalance
 * Methods: calculateMonthlyInterest, modifyIntestRate, getSavingsBalance, deposit, withdraw 
 * Input: double balance, double newRate 
 * Processing: perform calculations on the savings balance and interest rate 
 * Output: savingsBalance
 * 
 * This class represents a savings account with a balance and an annual interest rate.
 * It provides methods to calculate monthly interest, modify the interest rate,
 * and access the account balance. Additionally, it allows deposits and withdrawals.
 *
 */
package SavingsAccountPackage;

public class SavingsAccount {
    public static double annualInterestRate = 0.04;
    public double savingsBalance;

    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance = savingsBalance + monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double amount) {
        savingsBalance += amount;
    }

    public void withdraw(double amount) {
        savingsBalance -= amount;
    }

}
