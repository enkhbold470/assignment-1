/*
 * Class Design: StudentGradingException
 * 
 * Packages: exception
 * import: java.io.FileWriter, java.io.IOException, java.time.LocalDateTime
 * Variables: None
 * Testing: Driver1
 * Input: Exception message (String)
 * Processing: logException
 * Output: Log message to file
 */

package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class StudentGradingException extends Exception {
    public StudentGradingException(String message) {
        super(message);
        logException(message);
    }

    private void logException(String message) {
        try (FileWriter writer = new FileWriter("exception_log.txt", true)) {
            writer.write(LocalDateTime.now() + ": " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
