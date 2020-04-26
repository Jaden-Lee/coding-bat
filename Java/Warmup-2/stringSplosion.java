public class stringSplosion {
    public String stringSplosion(String str) {
        String ret = "";
        for (int i = 0; i <= str.length(); i++) {
          ret += str.substring(0,i);
        }
        return ret;
    }      
}