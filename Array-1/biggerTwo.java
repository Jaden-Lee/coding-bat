public class biggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        return a[0]+a[1] > b[0]+b[1] ? a : a[0]+a[1] == b[0]+b[1] ? a : b;
    }      
}