/*
 * Class Design: StudentAPIImpl
 * 
 * Packages: adapter
 * import: util.StudentGrade
 * Implements: StudentAPI
 * Variables: None
 * Testing: Driver3
 * Input: StudentGrade object, Student ID (String)
 * Processing: printStudentStatistics, printScoreById
 * Output: Student statistics, student scores
 */

package adapter;

import util.StudentGrade;

public class StudentAPIImpl implements StudentAPI {
    @Override
    public void printStudentStatistics(StudentGrade studentGrade) {
        System.out.println("Statistics: High = " + studentGrade.getStatistics().getHigh() +
                ", Low = " + studentGrade.getStatistics().getLow() +
                ", Average = " + studentGrade.getStatistics().getAverage());
    }

    @Override
    public void printScoreById(StudentGrade studentGrade, String id) {
        if (studentGrade.getStudent().getId().equals(id)) {
            System.out.println("Scores for student " + id + ": " + studentGrade.getStudent().getLabScores());
        } else {
            System.out.println("Student ID not found.");
        }
    }
}
