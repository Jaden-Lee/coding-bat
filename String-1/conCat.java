public class conCat {
    public String conCat(String a, String b) {
        return a.length() == 0 ? b : b.length() == 0 ? a : a.substring(a.length()-1).equals(b.substring(0,1)) ? a+b.substring(1) : a+b;
    }      
}