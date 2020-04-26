public class strCopies {
    public boolean strCopies(String str, String sub, int n) {
        return strCount(str,sub) >= n;
        }
    public int strCount(String str, String sub) {
        return str.indexOf(sub) == -1 ? 0 : 1+strCount(str.substring(str.indexOf(sub)+1),sub);
    }
}