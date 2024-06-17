/*
 * Class Design: Driver3
 * 
 * Packages: driver
 * import: adapter.StudentAPI, adapter.StudentAPIImpl, util.*
 * Variables: None
 * Testing: None
 * Input: Student ID, lab scores, statistics
 * Processing: API methods
 * Output: Student statistics, student scores
 */

package driver;

import adapter.StudentAPI;
import adapter.StudentAPIImpl;
import util.*;

import java.util.Arrays;

public class Driver3 {
    public static void main(String[] args) {
        Student student = new Student("123", Arrays.asList(80, 90, 85));
        Statistics statistics = new Statistics(90, 80, 85);
        StudentGrade studentGrade = new StudentGrade(student, statistics);

        StudentAPI api = new StudentAPIImpl();
        api.printStudentStatistics(studentGrade);
        api.printScoreById(studentGrade, "123");
    }
}
