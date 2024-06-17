/*
 * Class Design: Student
 * 
 * Packages: util
 * import: java.io.Serializable, java.util.List
 * Variables: id, labScores
 * Testing: Driver2, Driver3
 * Input: Student ID (String), lab scores (List<Integer>)
 * Processing: Getters and setters
 * Output: Student ID, lab scores
 */
package util;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
    private String id;
    private List<Integer> labScores;

    public Student(String id, List<Integer> labScores) {
        this.id = id;
        this.labScores = labScores;
    }

    public String getId() {
        return id;
    }

    public List<Integer> getLabScores() {
        return labScores;
    }
}
