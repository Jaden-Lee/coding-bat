public class arrayFront9 {
    public boolean arrayFront9(int[] nums) {
        return nums.length >= 4 ? (nums[0] == 9 || nums[1] == 9) || (nums[2] == 9 || nums[3] == 9) : nums.length == 3 ? (nums[0] == 9 || nums[1] == 9) || nums[2] == 9 : nums.length == 2 ? (nums[0] == 9 || nums[1] == 9) : nums.length == 1 ? nums[0] == 9 : false;
    }      
}