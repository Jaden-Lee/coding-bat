import java.util.Arrays;

public class scoresAverage {
    public int scoresAverage(int[] scores) {
        return Math.max(average(scores, 0, scores.length/2),average(scores, scores.length/2, scores.length));
    }
    public int average(int[] scores, int start, int end) {
        return sum(Arrays.copyOfRange(scores, start, end))/(end-start);
    }
    public int sum(int[] scores) {
        return scores.length == 1 ? scores[0] : scores[0] + sum(Arrays.copyOfRange(scores, 1, scores.length));
    }
}