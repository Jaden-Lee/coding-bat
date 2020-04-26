public class minCat {
    public String minCat(String a, String b) {
        return a == b ? a+b : a.length() < b.length() ? a+b.substring(b.length()-a.length()) : a.substring(a.length()-b.length())+b;
    }      
}