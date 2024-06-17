/*
 * Class Design: Driver1
 * 
 * Packages: driver
 * import: exception.StudentGradingException
 * Variables: None
 * Testing: None
 * Input: Exception message
 * Processing: Exception handling
 * Output: Exception message to console
 */

package driver;

import exception.StudentGradingException;

public class Driver1 {
    public static void main(String[] args) {
        try {
            throw new StudentGradingException("This is a test exception.");
        } catch (StudentGradingException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
