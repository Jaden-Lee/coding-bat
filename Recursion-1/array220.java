public class array220 {
    public boolean array220(int[] nums, int index) {
        if (nums.length == 0 || nums.length == 1) {
          return false;
        }
        int f = nums[0];
        int[] ret = new int[nums.length-1];
        for (int i = 1; i < nums.length; i++) {
          ret[i-1] = nums[i];
        }
        for (int i : ret) {
          if (f == 0) {
            if (i == 0) {
              return true;
            }
          }
          else {
            if (Math.ceil(1.0*i/f) == 10 && Math.floor(1.0*i/f) == 10) {
              return true;
            }
          }
        }
        return array220(ret, 0);
    }      
}