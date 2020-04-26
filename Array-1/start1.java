public class start1 {
    public int start1(int[] a, int[] b) {
        return (a.length == 0 ? 0 : a[0] == 1 ? 1 : 0) + (b.length == 0 ? 0 : b[0] == 1 ? 1 : 0);
    }
}