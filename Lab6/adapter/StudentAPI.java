/*
 * Interface Design: StudentAPI
 * 
 * Packages: adapter
 * import: util.StudentGrade
 * Methods: printStudentStatistics, printScoreById
 * Testing: Driver3
 * Input: StudentGrade object, Student ID (String)
 * Processing: printStudentStatistics, printScoreById
 * Output: Student statistics, student scores
 */

package adapter;

import util.StudentGrade;

public interface StudentAPI {
    void printStudentStatistics(StudentGrade studentGrade);

    void printScoreById(StudentGrade studentGrade, String id);
}
