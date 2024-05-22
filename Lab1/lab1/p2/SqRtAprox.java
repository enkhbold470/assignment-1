/*
Your Name: Enkhbold Ganbold
Class and Section: CIS35A
Assignment Number: Assignment1
Due Date: April.24
Date Submitted: April.22
 */
import java.util.Scanner;
 public class SqRtAprox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its square root: ");
        long num = scanner.nextLong();
        System.out.println("The square root of " + num + " is approximately " + sqrt(num));
        scanner.close();
    }
    public static double sqrt(long n) {
        double lastGuess = 1.0;
        double nextGuess = (lastGuess + n / lastGuess) / 2.0;
        while (Math.abs(nextGuess - lastGuess) >= 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2.0;
        }
        return nextGuess;
    }
}
// Enter a number to find its square root: 5
// The square root of 5 is approximately 2.236067977499978