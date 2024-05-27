/*
 * Class Design: Driver.java
 * 
 * Packages: SavingsAccountPackage
 * import: SavingsAccountPackage.SavingsAccount
 * Variables: SavingsAccount saver1, SavingsAccount saver2
 * Testing: 2000.00, 3000.00 
 * Input: None
 * Processing: define two SavingsAccount objects, modify the interest rate to 4%, calculate the monthly interest for each account and display the new balance for each account    
 * Output: Saver 1: $2080.00, Saver 2: $3120.00, all the process is done in the main method from the package SavingsAccountPackage
 */
import SavingsAccountPackage.*;

public class Driver {
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount (2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        
        System.out.println("Initial Balances: ");
        System.out.println("Saver 1: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2: $" + saver2.getSavingsBalance());
        
        SavingsAccount.modifyIntestRate(0.04);

        System.out.println("\nAfter calculating monthly interest at 4%:");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver 1: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2: $" + saver2.getSavingsBalance());

    }
}
