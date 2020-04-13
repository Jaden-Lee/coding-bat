public class dividesSelf {
    public boolean dividesSelf(int n) {
        for (int i = 0; i < Integer.toString(n).length(); i++) {
          int cur = Integer.parseInt(Integer.toString(n).substring(i,i+1));
          if (cur == 0) return false;
          else if (n % cur != 0) return false;
        }
        return true;
    }
}