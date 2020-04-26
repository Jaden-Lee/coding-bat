public class doubleChar {
    public String doubleChar(String str) {
        String ret = "";
        for (char c : str.toCharArray()) {
          ret += c;
          ret += c;
        }
        return ret;
    }      
}