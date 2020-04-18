import java.util.Arrays;

public class array123 {
    public boolean array123(int[] nums) {
        return (lookFor(nums.clone(),1) && lookFor(nums.clone(),2)) && lookFor(nums.clone(),3);
    }
    public boolean lookFor(int[] nums, int look) {
        return nums.length == 0 ? false : nums[0] == look ? true : lookFor(Arrays.copyOfRange(nums, 1, nums.length),look);
    }         
}