public class commonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        return a.length == 0 || b.length == 0 ? false : a[0] == b[0] || a[a.length-1] == b[b.length-1];
    }      
}