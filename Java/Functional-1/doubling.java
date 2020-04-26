public class doubling {
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(a -> a*2);
        return nums;
    }
}