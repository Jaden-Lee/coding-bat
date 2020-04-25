public class sumHeights2 {
    public int sumHeights2(int[] heights, int start, int end) {
        int ret = 0;
        for (int i = start; i < end; i++) {
          ret += heights[i] < heights[i+1] ? Math.abs(heights[i]-heights[i+1])*2 : Math.abs(heights[i]-heights[i+1]);
        }
        return ret;
    }
}