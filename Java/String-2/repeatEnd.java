public class repeatEnd {
    public String repeatEnd(String str, int n) {
        String ret = "";
        for (int i = 0; i < n; i++) {
          ret += str.substring(str.length()-n);
        }
        return ret;
    }      
}