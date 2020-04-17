public class arrayCount9 {
    public int arrayCount9(int[] nums) {
        return nums.length == 0 ? 0 : nums[0] == 9 ? 1+arrayCount9(Arrays.copyOfRange(nums,1,nums.length)) : arrayCount9(Arrays.copyOfRange(nums,1,nums.length));
    }      
}