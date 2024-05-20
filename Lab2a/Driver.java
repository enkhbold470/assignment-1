/*
 * Design Class: Driver    
 * 
 * Variables:
 * - scanner: A static Scanner object for reading input from the console.
 * 
 * Input:
 * - main(String[] args): The main method that is the entry point of the program. It creates instances of the Driver and Person classes.
 * - readValue(): A method that prompts the user for input and creates a new Person object with the provided details.
 * 
 * Processing:
 * - main(String[] args): This method creates a Driver object and uses it to create three Person objects. It then calls the print method on each Person object.
 * - readValue(): This method prompts the user for their name, address, age, and phone number. It then creates a new Person object with these details and returns it.
 * 
 * Output:
 * - main(String[] args): This method doesn't return anything. It prints the details of three Person objects to the console.
 * - readValue(): This method returns a Person object.
 * Testrun: 
 * 
 * Name: Elon Musk
 * Address: Market St, SF, CA
 * Age: 52
 * Phone Number: 1-310-363-6000
 */
import java.util.Scanner;
import userPackage.Person;

public class Driver {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Driver driver = new Driver();
        Person stacey = driver.readValue();
        stacey.print();
        Person ross = driver.readValue();
        ross.print();
        Person mia = driver.readValue();
        mia.print();
    }

    public Person readValue() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();
        return new Person(name, address, age, phoneNumber);
    }
}


