/*
 * Class Design: Driver2
 * 
 * Packages: driver
 * import: util.*
 * Variables: None
 * Testing: None
 * Input: Student ID, lab scores, statistics
 * Processing: Serialization
 * Output: Serialized file
 */

package driver;

import util.*;
import java.util.Arrays;

public class Driver2 {
    public static void main(String[] args) {
        Student student = new Student("123", Arrays.asList(80, 90, 85));
        Statistics statistics = new Statistics(90, 80, 85);
        StudentGrade studentGrade = new StudentGrade(student, statistics);

        FileIO fileIO = new FileIO();
        fileIO.serializeStudentGrade(studentGrade, "studentGrade.ser");

        System.out.println("StudentGrade object serialized successfully.");
    }
}
