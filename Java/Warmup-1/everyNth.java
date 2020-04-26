public class everyNth {
    public String everyNth(String str, int n) {
        return str.length() <= n ? str.substring(0,1) : str.substring(0,1)+everyNth(str.substring(n),n);

        // Alternative Solution
        // String ret = "";
        // for (int i = 0; i < Math.floor(str.length()/n)+1; i++) {
        //   if (str.length() <= i*n) {break;}
        //   ret += str.charAt(i*n);
        // }
        // return ret;
    }      
}