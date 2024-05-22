// Assignment: Lab -1, Part 2
import java.util.Scanner;

public class TempFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = 32 + celsius * (180.0 / 100.0);
        System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);

        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheitInput = scanner.nextDouble();
        double celsiusOutput = (fahrenheitInput - 32) * (100.0 / 180.0);
        System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheitInput, celsiusOutput);

        scanner.close();
    }
}
// Test Run:

// Enter a temperature in Celsius: 0
// 0.00 Celsius is 32.00 Fahrenheit
// Enter a temperature in Fahrenheit: 32
// 32.00 Fahrenheit is 0.00 Celsius

// Enter a temperature in Celsius: 100
// 100.00 Celsius is 212.00 Fahrenheit
// Enter a temperature in Fahrenheit: 212
// 212.00 Fahrenheit is 100.00 Celsius

// Enter a temperature in Celsius: -40
// -40.00 Celsius is -40.00 Fahrenheit
// Enter a temperature in Fahrenheit: -40
// -40.00 Fahrenheit is -40.00 Celsius
