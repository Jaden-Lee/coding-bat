public class sumHeights {
    public int sumHeights(int[] heights, int start, int end) {
        int ret = 0;
        for (int i = start; i < end; i++) {
          ret += Math.abs(heights[i]-heights[i+1]);
        }
        return ret;
    }      
}