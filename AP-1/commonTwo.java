import java.util.HashSet;

public class commonTwo {
    public int commonTwo(String[] a, String[] b) {
        HashSet<Integer> at = new HashSet();
        HashSet<Integer> bt = new HashSet();
        HashSet<Integer> t = new HashSet();
        for (int i = 0; i < a.length; i++) {
          t.add((int) a[i].charAt(0));
          at.add((int) a[i].charAt(0));
        }
        for (int i = 0; i < b.length; i++) {
          t.add((int) b[i].charAt(0));
          bt.add((int) b[i].charAt(0));
        }
        return bt.size()+at.size()-t.size();
    }      
}