/*
 * Class Design: Statistics
 * 
 * Packages: util
 * import: java.io.Serializable
 * Variables: high, low, average
 * Testing: Driver2, Driver3
 * Input: High score (int), low score (int), average score (double)
 * Processing: Getters and setters
 * Output: High score, low score, average score
 */
package util;

import java.io.Serializable;
import java.util.List;

public class Statistics implements Serializable {
    private int high;
    private int low;
    private double average;

    public Statistics(int high, int low, double average) {
        this.high = high;
        this.low = low;
        this.average = average;
    }

    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }

    public double getAverage() {
        return average;
    }
}
