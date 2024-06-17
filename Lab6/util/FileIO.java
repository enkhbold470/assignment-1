/*
 * Class Design: FileIO
 * 
 * Packages: util
 * import: java.io.FileOutputStream, java.io.IOException, java.io.ObjectOutputStream
 * Variables: None
 * Testing: Driver2
 * Input: StudentGrade object, filename (String)
 * Processing: serializeStudentGrade
 * Output: Serialized file
 */
package util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileIO {
    public void serializeStudentGrade(StudentGrade studentGrade, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(studentGrade);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
