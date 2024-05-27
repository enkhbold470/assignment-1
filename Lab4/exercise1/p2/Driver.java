/*
 * Class Design: Driver.java
 * 
 * Variables: private static final double HIGH_BALANCE_INTEREST_RATE, private static final double HIGH_BALANCE_THRESHOLD
 * Input: balance 
 * Processing: perform calculations on the savings balance and interest rate
 * Output: savingsBalance
 * 
 *
 */

import SavingsAccountPackage.SavingsAccount;
import SavingsAccountPackage.SpecialSavings;

public class Driver {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SpecialSavings saver2 = new SpecialSavings(3000.00);

        System.out.println("Initial Balances:");
        System.out.println("SavingsAccount : $" + saver1.getSavingsBalance());
        System.out.println("SpecialSavings : $" + saver2.getSavingsBalance());

        System.out.println("\nDepositing and Withdrawing some money");
        saver1.deposit(1000.00);
        saver2.deposit(500.00);
        saver1.withdraw(500.00);
        saver2.withdraw(1000.00);

        System.out.println("\nAfter Deposits and Withdrawals:");
        System.out.println("SavingsAccount : $" + saver1.getSavingsBalance());
        System.out.println("SpecialSavings : $" + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05); // Set interest rate to 5%

        System.out.println("\nAfter calculating monthly interest at 5%:");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("SavingsAccount : $" + saver1.getSavingsBalance());
        System.out.println("SpecialSavings (Earns 10% interest): $" + saver2.getSavingsBalance());
    }
}