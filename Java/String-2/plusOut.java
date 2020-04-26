public class plusOut {
    public String plusOut(String str, String word) {
        String ret = "";
        while (str.indexOf(word) != -1) {
          ret += filler(str.substring(0,str.indexOf(word)));
          ret += word;
          str = str.substring(str.indexOf(word)+word.length());
        }
        return ret+filler(str);
    }
    public String filler(String str) {
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
          ret += "+";
        }
        return ret;
    }
}