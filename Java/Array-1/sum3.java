public class sum3 {
    public int sum3(int[] nums) {
        return nums.length == 0 ? 0 : nums[0] + sum3(Arrays.copyOfRange(nums,1,nums.length));
    }
    // public int sum3(int[] nums) {
    //     return nums[0]+nums[1]+nums[2];
    // }
}