import java.util.Arrays;

public class scoresClump {
    public boolean scoresClump(int[] scores) {
        return scores.length == 3 ? scores[2]-scores[0] <= 2 : scores[2]-scores[0] <= 2 ? true : scoresClump(Arrays.copyOfRange(scores,1,scores.length));
    }      
}