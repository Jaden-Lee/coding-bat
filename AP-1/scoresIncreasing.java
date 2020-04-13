import java.util.Arrays;

public class scoresIncreasing {
    public boolean scoresIncreasing(int[] scores) {
        return scores.length == 2 ? scores[0] <= scores[1] : scores[0] <= scores[1] ? scoresIncreasing(Arrays.copyOfRange(scores, 1, scores.length)) : false;
    }
}