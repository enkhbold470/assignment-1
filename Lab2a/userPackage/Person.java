package userPackage;
/*
 * Design Class: Person    
 * 
 * Variables:
 * - name: A private string variable.
 * - address: A private string variable.
 * - age: A private string variable.
 * - phoneNumber: A private string variable.
 * 
 * Input:
 * - Person(): Default constructor.
 * - Person(String name, String address, int age, String phoneNumber): Constructor with parameters.
 * 
 * Processing:
 * - Person(String name, String address, int age, String phoneNumber): Assigns inputs to variables.
 * 
 * Output:
 * - getName(): Returns person's name.
 * 
 */

 import java.util.Scanner;
 // Class to hold personal information
 public class Person {
     private String name;
     private String address;
     private int age;
     private String phoneNumber;
 
     // Default constructor
     public Person() {
         this.name = "";
         this.address = "";
         this.age = 0;
         this.phoneNumber = "";
     }
 
     // Overloaded constructor
     public Person(String name, String address, int age, String phoneNumber) {
         this.name = name;
         this.address = address;
         this.age = age;
         this.phoneNumber = phoneNumber;
     }
 
     // Getter and setter methods
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public String getAddress() {
         return address;
     }
 
     public void setAddress(String address) {
         this.address = address;
     }
 
     public int getAge() {
         return age;
     }
 
     public void setAge(int age) {
         this.age = age;
     }
 
     public String getPhoneNumber() {
         return phoneNumber;
     }
 
     public void setPhoneNumber(String phoneNumber) {
         this.phoneNumber = phoneNumber;
     }
 
     // Print method
     public void print() {
         System.out.println("Name: " + name);
         System.out.println("Address: " + address);
         System.out.println("Age: " + age);
         System.out.println("Phone Number: " + phoneNumber);
         System.out.println();
     }
 }