import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Util {
    private String fname;

    public Util(String fname) {
        this.fname = fname;
    }

    public Student[] readFile() {
        Student[] students = new Student[40];
        try (BufferedReader br = new BufferedReader(new FileReader(fname))) {
            String line;
            int index = 0;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line);
                if (st.hasMoreTokens()) {
                    Student student = new Student();
                    student.setSID(Integer.parseInt(st.nextToken()));
                    int[] scores = new int[5];
                    for (int i = 0; i < 5; i++) {
                        scores[i] = Integer.parseInt(st.nextToken());
                    }
                    student.setScores(scores);
                    students[index++] = student;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return students;
    }
}
