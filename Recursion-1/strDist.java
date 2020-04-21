public class strDist {
    public int strDist(String str, String sub) {
        return str.length() < sub.length() ? 0 : str.substring(0, sub.length()).equals(sub) && str.substring(str.length() - sub.length()).equals(sub) ? str.length() : !str.substring(0, sub.length()).equals(sub) ? strDist(str.substring(1), sub) : strDist(str.substring(0, str.length()-1), sub);
    }
}