public class makeLast {
    public int[] makeLast(int[] nums) {
        int[] ret = new int[nums.length*2];
        ret[ret.length-1] = nums[nums.length-1];
        return ret;
    }      
}