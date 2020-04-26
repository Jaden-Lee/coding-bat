public class no23 {
    public boolean no23(int[] nums) {
        return nums.length == 0 ? true : nums[0] == 2 || nums[0] == 3 ? false : no23(Arrays.copyOfRange(nums,1,nums.length));
    }      
}