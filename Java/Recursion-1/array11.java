public class array11 {
    public int array11(int[] nums, int index) {
        return nums.length == index ? 0 : nums[index] == 11 ? 1+array11(nums,index+1) : array11(nums,index+1);
    }
}