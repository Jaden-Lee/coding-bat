import java.util.Arrays;

public class scores100 {
    public boolean scores100(int[] scores) {
        return scores.length == 2 ? (scores[0] == scores[1]) && (scores[0] == 100) : scores[0] != scores[1] ? scores100(Arrays.copyOfRange(scores, 1, scores.length)) : scores[0] == 100;
    }
}