public class mixString {
    public String mixString(String a, String b) {
        return a.length() == 0 ? b : b.length() == 0 ? a : a.substring(0,1)+b.substring(0,1)+mixString(a.substring(1),b.substring(1));
    }      
}