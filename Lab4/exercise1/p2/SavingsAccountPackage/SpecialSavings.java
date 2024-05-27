/*
 * Class Design: SpecialSavings.java
 * 
 * Packages: SavingsAccountPackage
 * Variables: private static final double HIGH_BALANCE_INTEREST_RATE, private static final double HIGH_BALANCE_THRESHOLD
 * Methods: SpecialSavings, calculateMonthlyInterest
 * Input: balance
 * Processing: perform calculations on the savings balance and interest rate 
 * Output: savingsBalance
 * 
 * This class represents a savings account with a balance and an annual interest rate.
 * It provides methods to calculate monthly interest, modify the interest rate,
 * and access the account balance. Additionally, it allows deposits and withdrawals.
 *
 */
package SavingsAccountPackage;

public class SpecialSavings extends SavingsAccount {

    private static final double HIGH_BALANCE_INTEREST_RATE = 0.10;
    private static final double HIGH_BALANCE_THRESHOLD = 10000;

    public SpecialSavings(double balance) {
        super(balance);
    }

    @Override
    public void calculateMonthlyInterest() {
        double monthlyInterest;
        if (savingsBalance > HIGH_BALANCE_THRESHOLD) {
            monthlyInterest = savingsBalance * HIGH_BALANCE_INTEREST_RATE / 12;
        } else {
            monthlyInterest = savingsBalance * annualInterestRate / 12;
        }
        savingsBalance += monthlyInterest;
    }
}
