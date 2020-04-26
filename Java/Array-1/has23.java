public class has23 {
    public boolean has23(int[] nums) {
        return nums.length == 0 ? false : nums[0] == 2 || nums[0] == 3 ? true : has23(Arrays.copyOfRange(nums,1,nums.length));
    }      
}