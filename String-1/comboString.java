public class comboString {
    public String comboString(String a, String b) {
        return a.length() == 0 ? b : b.length() == 0 ? a : a.length() < b.length() ? a+b+a : b+a+b;
    }      
}