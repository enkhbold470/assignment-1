/*
 * Class Design: StudentGrade
 * 
 * Packages: util
 * import: java.io.Serializable
 * Variables: student, statistics
 * Testing: Driver2, Driver3
 * Input: Student object, Statistics object
 * Processing: Getters and setters
 * Output: Student object, Statistics object
 */
package util;

import java.io.Serializable;

public class StudentGrade implements Serializable {
    private Student student;
    private Statistics statistics;

    public StudentGrade(Student student, Statistics statistics) {
        this.student = student;
        this.statistics = statistics;
    }

    public Student getStudent() {
        return student;
    }

    public Statistics getStatistics() {
        return statistics;
    }
}
