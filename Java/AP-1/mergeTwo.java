import java.util.TreeSet;

public class mergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        TreeSet<Integer> t = new TreeSet();
        for (int i = 0; i < a.length; i++) {
          t.add((int) a[i].charAt(0));
        }
        for (int i = 0; i < b.length; i++) {
          t.add((int) b[i].charAt(0));
        }
        String[] ret = new String[n];
        for (int i = 0; i < n; i++) {
          ret[i] = (char)((int) t.pollFirst())+"";
        }
        return ret;
    }
}