public class oneTwo {
    public String oneTwo(String str) {
        String ret = "";
        for (int i = 0; i < str.length(); i += 3) {
          if (str.length()-i < 3) {
            break;
          }
          String cur = str.substring(i,i+3);
          ret += cur.substring(1)+cur.substring(0,1);
        }
        return ret;
    }      
}