import java.util.Arrays;

public class has271 {
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
          int[] cur = Arrays.copyOfRange(nums,i,i+3);
          if (cur[0] + 5 == cur[1]) {
            if (cur[0]-cur[2] <= 3 && cur[0]-cur[2] >= 0) {
              return true;
            }
            else if (cur[2]-cur[0] == 1) {
              return true;
            }
          }
        }
        return false;
    }      
}