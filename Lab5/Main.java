/* Design
Variables

Student Class:
    int SID: To store the student ID.
    int[] scores: An array to store the scores for each quiz.

Statistics Class:
    int[] lowScores: To store the lowest scores for each quiz.
    int[] highScores: To store the highest scores for each quiz.
    float[] avgScores: To store the average scores for each quiz.

Util Class:
    String fname: To store the name of the file to read data from.

Input

Util Class:
    - Use BufferedReader and FileReader to read student data from the file.
    - Tokenize each line using StringTokenizer to extract student IDs and quiz scores.

Processing

Student Class:
    - Methods to get and set student ID and scores.

Statistics Class:
    - findLow(Student[] students): Calculate the lowest score for each quiz.
    - findHigh(Student[] students): Calculate the highest score for each quiz.
    - findAvg(Student[] students): Calculate the average score for each quiz.

Output

Student Class:
    - print(): Print the student ID and scores.

Statistics Class:
    - print(int option): Print the low scores, high scores, average scores, or all statistics based on the given option.
*/

public class Main {
    public static void main(String[] args) {
        Student[] lab2 = new Student[40];

        Util util = new Util("filename.txt");
        lab2 = util.readFile();

        for (Student student : lab2) {
            if (student != null) {
                student.print();
            }
        }

        Statistics statlab2 = new Statistics();
        statlab2.findlow(lab2);
        statlab2.findhigh(lab2);
        statlab2.findavg(lab2);

        System.out.println("Statistics:");
        statlab2.print(4);
    }
}
