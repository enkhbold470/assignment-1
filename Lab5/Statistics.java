public class Statistics {
    private int[] lowscores = new int[5];
    private int[] highscores = new int[5];
    private float[] avgscores = new float[5];

    public void findlow(Student[] students) {
        for (int i = 0; i < 5; i++) {
            lowscores[i] = Integer.MAX_VALUE;
        }
        for (Student student : students) {
            if (student != null) {
                int[] scores = student.getScores();
                for (int i = 0; i < scores.length; i++) {
                    if (scores[i] < lowscores[i]) {
                        lowscores[i] = scores[i];
                    }
                }
            }
        }
    }

    public void findhigh(Student[] students) {
        for (int i = 0; i < 5; i++) {
            highscores[i] = Integer.MIN_VALUE;
        }
        for (Student student : students) {
            if (student != null) {
                int[] scores = student.getScores();
                for (int i = 0; i < scores.length; i++) {
                    if (scores[i] > highscores[i]) {
                        highscores[i] = scores[i];
                    }
                }
            }
        }
    }

    public void findavg(Student[] students) {
        int[] totalScores = new int[5];
        int studentCount = 0;
        for (Student student : students) {
            if (student != null) {
                studentCount++;
                int[] scores = student.getScores();
                for (int i = 0; i < scores.length; i++) {
                    totalScores[i] += scores[i];
                }
            }
        }
        for (int i = 0; i < totalScores.length; i++) {
            avgscores[i] = (float) totalScores[i] / studentCount;
        }
    }

    public void print(int option) {
        switch (option) {
            case 1:
                System.out.printf("Low Scores: %3d %3d %3d %3d %3d%n", lowscores[0], lowscores[1], lowscores[2],
                        lowscores[3], lowscores[4]);
                break;
            case 2:
                System.out.printf("High Scores: %3d %3d %3d %3d %3d%n", highscores[0], highscores[1], highscores[2],
                        highscores[3], highscores[4]);
                break;
            case 3:
                System.out.printf("Average Scores: %6.2f %6.2f %6.2f %6.2f %6.2f%n", avgscores[0], avgscores[1],
                        avgscores[2], avgscores[3], avgscores[4]);
                break;
            case 4:
                print(1);
                print(2);
                print(3);
                break;
        }
    }
}
