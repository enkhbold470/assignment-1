/*
 * Class Design: SavingsAccount.java
 * 
 * Packages: SavingsAccountPackage
 * Variables: private static double annualInterestRate, private double savingsBalance
 * Methods: calculateMonthlyInterest, modifyIntestRate, getSavingsBalance 
 * Input: double balance, double newRate 
 * Processing: perform calculations on the savings balance and interest rate 
 * Output: savingsBalance
 */
package SavingsAccountPackage;
public class SavingsAccount{
    private static double annualInterestRate = 0.04;
    private double savingsBalance;

    public SavingsAccount(double balance){
        this.savingsBalance = balance;
    }
    public void calculateMonthlyInterest(){
        double monthlyInterest = savingsBalance * annualInterestRate/12;
        savingsBalance = savingsBalance + monthlyInterest;
    }

    public static void modifyIntestRate(double newRate){
        annualInterestRate = newRate;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }
    
}
