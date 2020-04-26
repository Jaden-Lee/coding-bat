import java.util.Arrays;

public class noTriples {
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
          int[] cur = Arrays.copyOfRange(nums,i,i+3);
          if (cur[0] == cur[1] && cur[1] == cur[2]) return false;
        }
        return true;
    }      
}