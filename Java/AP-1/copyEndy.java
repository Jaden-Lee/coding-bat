import java.util.ArrayList;

public class copyEndy {
    public int[] copyEndy(int[] nums, int count) {
        ArrayList<Integer> tret = new ArrayList();
        for (int num : nums) {
          if (isEndy(num)) {
            tret.add(num);
          }
        }
        int[] ret = new int[count];
        for (int i = 0; i < count; i++) {
          ret[i] = tret.get(i);
        }
        return ret;
      }
      public boolean isEndy(int n) {
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }
}