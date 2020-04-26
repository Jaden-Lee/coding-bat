public class sameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        return nums.length == 0 ? false : nums[0] == nums[nums.length-1];
    }      
}