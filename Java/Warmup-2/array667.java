import java.util.Arrays;

public class array667 {
    public int array667(int[] nums) {
        return nums.length < 2 ? 0 : nums.length == 2 ? nums[0] == 6 && (nums[1] == 6 || nums[1] == 7) ? 1 : 0 : nums[0] == 6 && (nums[1] == 6 || nums[1] == 7) ? 1+array667(Arrays.copyOfRange(nums,1,nums.length)) : array667(Arrays.copyOfRange(nums,1,nums.length));
    }      
}