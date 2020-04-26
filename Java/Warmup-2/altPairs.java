public class altPairs {
    public String altPairs(String str) {
        int i = 0;
        String ret = "";
        while (i < str.length()) {
          ret += i % 4 <= 1 ? str.substring(i,i+1) : "";
          i++;
        }
        return ret;
    }      
}