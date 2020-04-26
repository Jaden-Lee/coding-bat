public class array6 {
    public boolean array6(int[] nums, int index) {
        return nums.length == index ? false : nums[index] == 6 ? true : array6(nums,index+1);
    }
}