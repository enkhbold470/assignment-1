public class Student {
    private int SID;
    private int[] scores = new int[5];

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public void print() {
        System.out.printf("%d %3d %3d %3d %3d %3d%n", SID, scores[0], scores[1], scores[2], scores[3], scores[4]);
    }
}
