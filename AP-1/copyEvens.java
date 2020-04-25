import java.util.ArrayList;

public class copyEvens {
    public int[] copyEvens(int[] nums, int count) {
        ArrayList<Integer> tret = new ArrayList();
        for (int num : nums) {
          if (num % 2 == 0) {
            tret.add(num);
          }
        }
        int[] ret = new int[count];
        for (int i = 0; i < count; i++) {
          ret[i] = tret.get(i);
        }
        return ret;
    }      
}